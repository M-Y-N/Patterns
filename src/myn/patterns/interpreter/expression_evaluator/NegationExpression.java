package myn.patterns.interpreter.expression_evaluator;

/**
 * Expression that negates some other {@link Expression}
 */
public class NegationExpression implements Expression {

    /**
     * the inner expression
     */
    private Expression innerExpression;


    /**
     * Instantiates a new Negation expression
     *
     * @param innerExpression the inner expression of the negation
     */
    public NegationExpression(Expression innerExpression) {
        this.innerExpression = innerExpression;
    }

    /**
     * Gets the inner expression
     *
     * @return the inner expression
     */
    public Expression getInnerExpression() {
        return innerExpression;
    }

    /**
     * Sets the inner expression
     *
     * @param innerExpression the inner expression
     */
    public void setInnerExpression(Expression innerExpression) {
        this.innerExpression = innerExpression;
    }

    @Override
    public String toString() {

        return String.format("(-%s)", innerExpression.toString());
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
        return -innerExpression.evaluate(context);
    }
}
