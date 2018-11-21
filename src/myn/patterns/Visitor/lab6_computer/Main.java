package myn.patterns.visitor.lab6_computer;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Головний клас Main для запуску програми
 */
public class Main {

    public static void main(String[] args) {
        IElementOfComputers computers = new Computer();
        VisitorComputer visitorComputer = new VisitorComputer();

        computers.accept(visitorComputer);

        visitorComputer.printTotalPower();
    }
}
