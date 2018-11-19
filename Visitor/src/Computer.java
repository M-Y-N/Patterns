public class Computer implements IElementOfComputers {
    private double power;

    private IElementOfComputers[] elements;
    public double getPower() {
        return power;
    }

    public Computer() {
        power = 100.5;
        this.elements = new IElementOfComputers[]   {
                new Memory(30),
                new Processor(50),
                new VideoCard(40)
        };
    }

    public Computer(double power) {
        this.power = power;
    }

    @Override
    public void accept(IVisitor visitor){
        for (IElementOfComputers elementsOfComputer:elements
             ) {
            elementsOfComputer.accept(visitor);
        }
        visitor.visit(this);
    }

}
