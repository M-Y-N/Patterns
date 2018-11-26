package myn.patterns.interpreter.expression_evaluator;

import java.util.HashMap;

/**
 * The evaluation context for the {@link Expression} AST
 */
public class EvaluationContext {

    /**
     * map of variables
     */
    private final HashMap<String, Double> variables = new HashMap<>();


    /**
     * Sets the variable in the evaluation context
     *
     * @param name  the name of the variable
     * @param value the value of the variable
     */
    public void setVariable(String name, double value) {
        variables.put(name, value);
    }

    /**
     * removes all the variables from the evaluation context
     */
    public void clearVariables() {
        variables.clear();
    }

    /**
     * Gets the value of the variable that is currently present in this context
     *
     * @param name the name of the variable to get
     * @return the value of the variable
     * @throws IllegalStateException if the variable with name {@code name}
     *                               does not exist in the current context
     */
    public double getVariable(String name) {
        if (!variables.containsKey(name)) {
            throw new IllegalStateException(String.format("evaluation error: variable %s does not exist in the current context", name));
        }
        return variables.get(name);


    }
}
