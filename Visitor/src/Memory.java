public class Memory implements IElementOfComputers {
    private double power;

    public double getPower() {
        return power;
    }

    public Memory() {
        power = 100.5;
    }

    public Memory(double power) {
        this.power = power;
    }

    @Override
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
