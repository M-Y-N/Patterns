package myn.patterns.builder.composite_expression;

/**
 * The type Complex expression.
 */
public class ComplexExpression implements Expression {

    /**
     * left side of the expression
     */
    private Expression left;

    /**
     * Operation in this complex expression
     */
    private Operation operation;

    /**
     * right side of the expression
     */
    private Expression right;


    /**
     * Instantiates a new Complex expression
     *
     * @param left      the left expression
     * @param operation the operation
     * @param right     the right expression
     */
    public ComplexExpression(Expression left, Operation operation, Expression right) {
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    /**
     * Instantiates en empty {@link ComplexExpression}
     */
    public ComplexExpression() {
    }

    /**
     * Gets the left {@link Expression}
     *
     * @return the left{@link Expression}
     */
    public Expression getLeft() {
        return left;
    }

    /**
     * Gets operation.
     *
     * @return the operation
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Gets the right {@link Expression}
     *
     * @return the right {@link Expression}
     */
    public Expression getRight() {
        return right;
    }

    /**
     * Sets the left {@link Expression}
     *
     * @param left the left {@link Expression}
     */
    public void setLeft(Expression left) {
        this.left = left;
    }

    /**
     * Sets operation.
     *
     * @param operation the operation
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * Sets the right {@link Expression}
     *
     * @param right the right {@link Expression}
     */
    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("(%s %s %s)", left.toString(), operation.toString(), right.toString());
    }

}
