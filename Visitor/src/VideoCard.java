public class VideoCard implements IElementOfComputers {
    private double power;

    public double getPower() {
        return power;
    }

    public VideoCard() {
        power = 100.5;
    }

    public VideoCard(double power) {
        this.power = power;
    }

    @Override
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
