package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Decorator class for printing text by upper case way
 */
public class UpperCasePrint extends AbstractPrintDecorator {

    /**
     * Constructor of upper case printer
     *
     * @param printer next object other printer for next variant of typing
     */
    public UpperCasePrint(Print printer) {
        super(printer);
    }

    /**
     * Typing upper case text in the editor
     *
     * @return the operation
     */
    @Override
    public String print(String text) {
        return printer.print(text).toUpperCase();
    }
}
