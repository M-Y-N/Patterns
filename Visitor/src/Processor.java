public class Processor implements IElementOfComputers{
    private double power;

    public double getPower() {
        return power;
    }

    public Processor() {
        power = 100.5;
    }

    public Processor(double power) {
        this.power = power;
    }

    @Override
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
