public class BasicButton implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
