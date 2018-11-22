package myn.patterns.builder.composite_expression;

/**
 * Main class
 */
public class Main {

    /**
     * Main method
     *
     * @param args program arguments
     */
    public static void main(String[] args) {
        ExpressionBuilder builder = new ExpressionBuilder();
        //building -10 + 3*x - y
        builder.startComplexExpression().leftExpression()
                .startComplexExpression()
                    .leftExpression().negation().setConstant(10)
                    .setOperation(Operation.PLUS)
                    .rightExpression().startComplexExpression()
                        .leftExpression().setConstant(3)
                        .setOperation(Operation.MULT)
                        .rightExpression().setVariable("x")
                    .endComplexExpression()
                .endComplexExpression()
                .setOperation(Operation.MINUS)
                .rightExpression().setVariable("y")
                .endComplexExpression();
        Expression result = builder.getResult();
        System.out.println(result);
    }
}
