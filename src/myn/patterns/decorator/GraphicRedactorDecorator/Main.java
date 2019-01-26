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
        AbstractShapeRedactor shapeRedactor = new ShapeRedactor(3, 3, 10);
        AbstractShapeRedactor shape = new MoveDownShape(new MoveUpShape(new ReduceShape(new IncreaseShape(shapeRedactor))));
        shape.draw(shapeRedactor);
    }
}
