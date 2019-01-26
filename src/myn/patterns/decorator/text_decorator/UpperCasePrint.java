package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Decorator class for printing text by upper register way
 */
public class UpperCasePrint extends AbstractPrintDecorator {

    /**
     * Constructor of upper register printer
     *
     * @param printer next object other printer for next variant of typing
     */
    public UpperCasePrint(Print printer) {
        super(printer);
    }

    /**
     * Typing upper register text in the editor
     *
     * @return the operation
     */
    @Override
    public String print(String text) {
        return printer.print(text).toUpperCase();
    }
}
