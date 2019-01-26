package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Class for printing text without changes
 */
public class TextPrint implements Print {

    /**
     * Constructor of printer without changes
     */
    public TextPrint() {
    }

    /**
     * Typing text without changes in the editor
     *
     * @return the operation
     */
    @Override
    public String print(String text) {
        return text;
    }
}
