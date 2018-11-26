package myn.patterns.builder.composite_expression;

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

}
