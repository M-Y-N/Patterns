public interface IVisitor {
    void visit(Computer computer);
    void visit(Memory memory);
    void visit(Processor processor);
    void visit(VideoCard videoCard);
}
