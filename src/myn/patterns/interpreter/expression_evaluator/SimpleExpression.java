package myn.patterns.interpreter.expression_evaluator;

/**
 * a simple expression that can be either a variable with a name or a constant with a value and no name
 */
public class SimpleExpression implements Expression {

    /**
     * the name of the variable
     */
    private String name;

    /**
     * the value of the constant
     */
    private Double value;


    /**
     * Instantiates a new Simple expression.
     *
     * @param name the name
     */
    public SimpleExpression(String name) {
        this.name = name;
    }

    /**
     * Instantiates a new Simple expression.
     *
     * @param value the value
     */
    public SimpleExpression(Double value) {
        this.value = value;
    }

    /**
     * Gets name of the variable
     *
     * @return the name of the variable
     */
    public String getName() {
        return name;
    }

    /**
     * Gets value of the constant
     *
     * @return the value
     */
    public Double getValue() {
        return value;
    }


    /**
     * Sets name of the variable
     * if the value is set the it is removed
     *
     * @param name the name of the variable
     */
    public void setName(String name) {
        this.name = name;
        value = null;
    }

    /**
     * Sets value of the constant
     * if a name is set then it is removed
     *
     * @param value the value
     */
    public void setValue(Double value) {
        this.value = value;
        name = null;
    }

    /**
     * checks if this {@link SimpleExpression} is a variable
     *
     * @return {@code true} if it is a variable
     */
    public boolean isVariable() {
        return name != null;
    }

    /**
     * checks if this {@link SimpleExpression} is a constant
     *
     * @return {@code true} if it is a constant
     */
    public boolean isConstant() {
        return !isVariable();
    }


    @Override
    public String toString() {
        if (name != null) {
            return name;
        }
        if (value != null) {
            return value.toString();
        }
        throw new IllegalStateException("Simple expression is empty");
    }

    /**
     * Evaluates this expression from the given {@code context}
     *
     * @param context the evaluation context to evaluate against
     * @return the result of the expression evaluated against the context
     * @throws IllegalStateException in the evaluation failed for some reason
     */
    @Override
    public double evaluate(EvaluationContext context) {
        if (isConstant()) {
            return value;
        }
       return context.getVariable(name);
    }
}
