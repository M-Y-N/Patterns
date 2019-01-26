package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Main class that realized text decorator work
 */
public class Main {
    /**
     * Main method
     *
     * @param args program arguments
     */
    public static void main(String[] args) {
        Print print1 = new SymbolNewLinePrint(new UpperCasePrint(new TextPrint()));
        Print print2 = new SymbolNewLinePrint(new QuotationPrint(new LowerCasePrint(new TextPrint())));
        Print print3 = new QuotationPrint(new LowerCasePrint(new TextPrint()));

        System.out.println(print1.print("Print First"));
        System.out.println(print2.print("Print Second"));
        System.out.println(print3.print("Print Third"));
    }
}
