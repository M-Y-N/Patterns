package myn.patterns.decorator.text_decorator;

public class SymbolNewLinePrint extends Print {
    private Print printer;

    public SymbolNewLinePrint(Print printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        return printer.print() + "\n";
    }
}
