public interface Visitor {
    void visit (BasicButton basicButton);
    void visit (BigButton bigButton);
    void visit (GoldButton goldButton);
    void visit (Panel panel);
}
