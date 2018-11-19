public class BigButton implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
