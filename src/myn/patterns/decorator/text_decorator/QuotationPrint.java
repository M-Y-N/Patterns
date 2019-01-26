package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Decorator class for printing text with quotations
 */
public class QuotationPrint extends Print {
    /**
     * object other printer for combination different variant of typing
     */
    private Print printer;

    /**
     * Constructor of printer with quotations
     *
     * @param printer next object other printer for next variant of typing
     */
    public QuotationPrint(Print printer) {
        this.printer = printer;
    }

    /**
     * Typing text with quotations in the editor
     *
     * @return the operation
     */
    @Override
    public String print() {
        return "\"" + printer.print() + "\"";
    }
}
