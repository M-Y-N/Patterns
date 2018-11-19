public class CounterVisitor implements Visitor{
    private int countBasicButton;
    private int countBigButton;
    private int countGoldButton;
    private int countPanel;
    @Override
    public void visit(BasicButton basicButton) {
        countBasicButton++;
    }

    @Override
    public void visit(BigButton bigButton) {
        countBigButton++;
    }

    @Override
    public void visit(GoldButton goldButton) {
        countGoldButton++;
    }

    @Override
    public void visit(Panel panel) {
        countPanel++;
    }

    @Override
    public String toString() {
        return "CounterVisitor{" +
                "countBasicButton=" + countBasicButton +
                ", countBigButton=" + countBigButton +
                ", countGoldButton=" + countGoldButton +
                ", countPanel=" + countPanel +
                '}';
    }
}
