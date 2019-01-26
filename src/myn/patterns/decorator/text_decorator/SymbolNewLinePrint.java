package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Decorator class for printing text with symbol of new line
 */
public class SymbolNewLinePrint extends Print {
    /**
     * object other printer for combination different variant of typing
     */
    private Print printer;

    /**
     * Constructor of printer with symbol of new line
     *
     * @param printer next object other printer for next variant of typing
     */
    public SymbolNewLinePrint(Print printer) {
        this.printer = printer;
    }

    /**
     * Typing text with symbol of new line in the editor
     *
     * @return the operation
     */
    @Override
    public String print() {
        return printer.print() + "\n";
    }
}
