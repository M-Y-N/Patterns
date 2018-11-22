package myn.patterns.interpreter.expression_evaluator;

/**
 * simple expression marker interface
 */
public interface Expression {


    /**
     * Evaluates this expression from the given {@code context}
     *
     * @param context the evaluation context to evaluate against
     * @return the result of the expression evaluated against the context
     * @throws IllegalStateException in the evaluation failed for some reason
     */
    double evaluate(EvaluationContext context);
}
