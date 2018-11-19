public class Main {

    public static void main(String[] args) {
        IElementOfComputers computers = new Computer();
        VisitorComputer visitorComputer = new VisitorComputer();
        computers.accept(visitorComputer);
        visitorComputer.printTotalPower();
    }
}
