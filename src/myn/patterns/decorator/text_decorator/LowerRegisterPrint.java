package myn.patterns.decorator.text_decorator;

public class LowerRegisterPrint extends Print {
    private Print printer;

    public LowerRegisterPrint(Print printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        return printer.print().toLowerCase();
    }
}
