package myn.patterns.builder.composite_expression;


import java.util.Stack;


/**
 * Simple expression builder with fluent interface for a tree like structure
 */
public class ExpressionBuilder {

    /**
     * Stack of complex expressions to support tree like fluent control
     */
    private Stack<Expression> expressionStack = new Stack<>();

    /**
     * Stack of the builder states
     */
    private Stack<BuilderState> builderStateStack = new Stack<>();

    /**
     * last expression that was used for operation
     * (in the end points to the root expression)
     */
    private Expression last = null;

    /**
     * start the new complex expression at this point in the root expression
     *
     * @return this
     */
    public ExpressionBuilder startComplexExpression() {
        throwIfComplex();
        expressionStack.push(new ComplexExpression());
        builderStateStack.push(BuilderState.COMPLEX);
        last = expressionStack.peek();
        return this;
    }

    /**
     * Ends the complex expression and return builder control to the point before {@link ExpressionBuilder#startComplexExpression()}
     * was called
     *
     * @return this
     */
    public ExpressionBuilder endComplexExpression() {
        throwIfNotComplex();
        ComplexExpression pop = (ComplexExpression) expressionStack.pop();
        throwIfComplexExpressionIsNotCompleted(pop);
        builderStateStack.pop();
        //pop the left/right prev state
        if (!builderStateStack.isEmpty()) {
            last = expressionStack.peek();
            attachExpressionToParent(pop, builderStateStack.peek());
        }
        return this;
    }

    /**
     * Enters the left part of the complex expression
     *
     * @return this
     */
    public ExpressionBuilder leftExpression() {
        throwIfNotComplex();
        builderStateStack.push(BuilderState.LEFT);
        return this;
    }

    /**
     * enters the right part of the complex expression
     *
     * @return this
     */
    public ExpressionBuilder rightExpression() {
        throwIfNotComplex();
        builderStateStack.push(BuilderState.RIGHT);
        return this;
    }

    /**
     * sets the operation of the complex expression
     *
     * @param operation the operation to set on this complex expression
     * @return this
     */
    public ExpressionBuilder setOperation(Operation operation) {
        throwIfNotComplex();
        ((ComplexExpression) last).setOperation(operation);
        return this;
    }

    /**
     * Whatever the next call to the builder will be, it will be negated
     *
     * @return this
     */
    public ExpressionBuilder negation() {
        throwIfComplex();
        expressionStack.push(new NegationExpression(null));

        builderStateStack.push(BuilderState.NEGATION);
        last = expressionStack.peek();
        return this;
    }

    /**
     * sets a variable as a simple expression at this point in the expression
     *
     * @param name the name of the variable
     * @return this
     */
    public ExpressionBuilder setVariable(String name) {
        setExpression(new SimpleExpression(name));
        return this;
    }

    /**
     * gets the last expression, ignores all the safety
     *
     * @return the last expression that was in the stack
     */
    public Expression getLast() {
        return last;
    }

    /**
     * sets a constant as a simple expression at this point in the expression
     *
     * @param val the value of the constant
     * @return this
     */
    public ExpressionBuilder setConstant(double val) {
        setExpression(new SimpleExpression(val));
        return this;
    }

    /**
     * gets the result and resets the builder
     *
     * @return the result of the build
     */
    public Expression getResult() {
        Expression result = last;
        if (!expressionStack.empty()) {
            throw new IllegalStateException();
        }
        reset();
        return result;
    }

    /**
     * sets an expression at this point of the tree
     *
     * @param e the expression to set
     */
    public ExpressionBuilder setExpression(Expression e) {
        throwIfComplex();
        if (builderStateStack.empty()) {
            last = e;
            return this;
        }
        BuilderState peek = builderStateStack.peek();
        attachExpressionToParent(e, peek);
        return this;
    }


    /**
     * look at the name
     *
     * @param e the expression to check
     * @throws IllegalArgumentException look at the name
     */
    private void throwIfComplexExpressionIsNotCompleted(ComplexExpression e) {
        boolean completed = e.getLeft() != null && e.getRight() != null && e.getOperation() != null;
        if (completed) {
            return;
        }
        throw new IllegalStateException("complex expression was not completed before it was ended");
    }

    /**
     * look at the name
     *
     * @throws IllegalArgumentException look at the name
     */
    private void throwIfNotComplex() {
        if (builderStateStack.empty() || builderStateStack.peek() != BuilderState.COMPLEX) {
            throw new IllegalStateException("builder was not in a complex expression");
        }
    }

    /**
     * look at the name
     *
     * @throws IllegalArgumentException look at the name
     */
    private void throwIfComplex() {
        if (builderStateStack.empty()) {
            return;
        }
        if (builderStateStack.peek() == BuilderState.COMPLEX) {
            throw new IllegalStateException("builder was in a complex expression. Was trying to set a leaf or the whole expression");
        }
    }

    /**
     * attaches {@code e} to the parent of the expression based on our point based on the {@code builderState}
     *
     * @param e            the expression to attach
     * @param builderState the current state on the stack
     * @throws IllegalArgumentException if the state is invalid
     */
    private void attachExpressionToParent(Expression e, BuilderState builderState) {
        switch (builderState) {
            case LEFT:
                ((ComplexExpression) last).setLeft(e);
                builderStateStack.pop();
                break;
            case RIGHT:
                ((ComplexExpression) last).setRight(e);
                builderStateStack.pop();
                break;
            case NEGATION:
                NegationExpression pop = (NegationExpression) expressionStack.pop();
                builderStateStack.pop();
                pop.setInnerExpression(e);
                if (!builderStateStack.isEmpty()) {
                    last = expressionStack.peek();
                    attachExpressionToParent(pop, builderStateStack.peek());
                }
                break;
            case COMPLEX:
                throw new IllegalStateException();
        }
    }

    /**
     * resets the builder
     */
    public void reset() {
        expressionStack.clear();
        builderStateStack.clear();
        last = null;
    }

    /**
     * the enum of the states of the builder
     */
    private enum BuilderState {
        COMPLEX,
        LEFT,
        RIGHT,
        NEGATION
    }
}