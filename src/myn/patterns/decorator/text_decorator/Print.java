package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Abstract class for printing text by different ways
 */
public abstract class Print {
    /**
     * text to be printed in the editor
     */
    protected String text;

    /**
     * Typing text in the editor
     *
     * @return the operation
     */
    public String print() {
        return text;
    }
}
