package myn.patterns.decorator.text_decorator;

public class Main {
    public static void main(String[] args) {
        Print print1 = new SymbolNewLinePrint(new UpperRegisterPrint(new TextPrint("Print First")));
        Print print2 = new SymbolNewLinePrint(new QuotationPrint(new LowerRegisterPrint(new TextPrint("Print Second"))));
        Print print3 = new QuotationPrint(new LowerRegisterPrint(new TextPrint("Print Third")));

        System.out.println(print1.print());
        System.out.println(print2.print());
        System.out.println(print3.print());
    }
}
