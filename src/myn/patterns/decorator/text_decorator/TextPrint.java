package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Class for printing text without changes
 */
public class TextPrint extends Print {

    /**
     * Constructor of printer without changes
     *
     * @param text text for printing in the editor
     */
    public TextPrint(String text) {
        super.text = text;
    }

    /**
     * Typing text without changes in the editor
     *
     * @return the operation
     */
    @Override
    public String print() {
        return text;
    }
}
