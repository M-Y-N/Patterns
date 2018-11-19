public class GoldButton implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
