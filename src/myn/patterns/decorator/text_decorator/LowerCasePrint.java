package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Decorator class for printing text by lower register way
 */
public class LowerCasePrint extends AbstractPrintDecorator {
    /**
     * Constructor of lower register printer
     *
     * @param printer next object other printer for next variant of typing
     */
    public LowerCasePrint(Print printer) {
        super(printer);
    }

    /**
     * Typing lower register text in the editor
     *
     * @return the operation
     */
    @Override
    public String print(String text) {
        return printer.print(text).toLowerCase();
    }
}
