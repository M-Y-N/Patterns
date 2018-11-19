public class VisitorComputer implements IVisitor {
    private double totalPower = 0;

    public VisitorComputer() {
    }

    public double getTotalPower() {
        return totalPower;
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Visit computer");
        totalPower+=computer.getPower();
    }

    @Override
    public void visit(Memory memory) {
        System.out.println("Visit memory");
        totalPower+=memory.getPower();
    }

    @Override
    public void visit(Processor processor) {
        System.out.println("Visit processor");
        totalPower+=processor.getPower();
    }

    @Override
    public void visit(VideoCard videoCard) {
        System.out.println("Visit videoCard");
        totalPower+=videoCard.getPower();
    }

    public void printTotalPower(){
        System.out.println("Total power of system is "+getTotalPower());
    }
}
