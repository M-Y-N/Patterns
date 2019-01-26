package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Decorator class for printing text with quotations
 */
public class QuotationPrint extends AbstractPrintDecorator {
    /**
     * Constructor of Quotation printer
     *
     * @param printer next object other printer for next variant of typing
     */
    public QuotationPrint(Print printer) {
        super(printer);
    }

    /**
     * Typing text with quotations in the editor
     *
     * @return the operation
     */
    @Override
    public String print(String text) {
        return "\"" + printer.print(text) + "\"";
    }
}
