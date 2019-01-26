package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Decorator class for printing text with symbol of new line
 */
public class SymbolNewLinePrint extends AbstractPrintDecorator {

    /**
     * Constructor of printer with symbol of new line
     *
     * @param printer next object other printer for next variant of typing
     */
    public SymbolNewLinePrint(Print printer) {
        super(printer);
    }

    /**
     * Typing text with symbol of new line in the editor
     *
     * @return the operation
     */
    @Override
    public String print(String text) {
        return printer.print(text) + "\n";
    }
}
