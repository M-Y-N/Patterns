package myn.patterns.interpreter.expression_evaluator;

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
        // expression -x + 3 * y
        Expression expression = new ComplexExpression(
                new NegationExpression( new SimpleExpression("x")),
                Operation.PLUS,
                new ComplexExpression(
                        new SimpleExpression(3.0),
                        Operation.MULT,
                        new SimpleExpression("y")
                ));
        System.out.println(expression);
        EvaluationContext context = new EvaluationContext();
        context.setVariable("x", 10);
        context.setVariable("y", 15);
        double result = expression.evaluate(context);
        System.out.println(result);
    }

}
