package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Main class for demo
 */
public class Main {
    /**
     * Main method
     *
     * @param args program arguments
     */
    public static void main(String[] args) {
        VectorRedactor vectorRedactor = new VectorRedactor();
        Shape shapeRedactor = new ShapeImpl(3, 3, 10);
        Shape shape = new MoveDownShape(new MoveUpShape(new ReduceShape(new IncreaseShape(shapeRedactor))));
        vectorRedactor.draw(shape);
    }
}
