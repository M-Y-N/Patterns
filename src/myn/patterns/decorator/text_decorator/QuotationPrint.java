package myn.patterns.decorator.text_decorator;

public class QuotationPrint extends Print {
    private Print printer;

    public QuotationPrint(Print printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        return "\"" + printer.print() + "\"";
    }
}
