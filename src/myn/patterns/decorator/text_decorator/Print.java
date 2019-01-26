package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Abstract class for printing text by different ways
 */
public interface Print {

    /**
     * Typing text in the editor
     *
     * @return the operation
     */
    public String print(String text);
}
