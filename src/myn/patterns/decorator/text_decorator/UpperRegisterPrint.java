package myn.patterns.decorator.text_decorator;

public class UpperRegisterPrint extends Print {
    private Print printer;

    public UpperRegisterPrint(Print printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        return printer.print().toUpperCase();
    }
}
