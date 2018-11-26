package myn.patterns.interpreter.expression_evaluator;

/**
 * Operation of the {@link ComplexExpression}
 */
public enum Operation {
    DIVIDE('/'),
    MINUS('-'),
    MULT('*'),
    PLUS('+');
    private char sign;

    Operation(char sign) {
        this.sign = sign;
    }

    /**
     * gets the sign
     *
     * @return the sign of the operation
     */
    @Override
    public String toString() {
        return Character.toString(sign);
    }
}
