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
        AbstractShape shapeRedactor = new Shape(3, 3, 10);
        AbstractShape shape = new MoveDownShape(new MoveUpShape(new ReduceShape(new IncreaseShape(shapeRedactor))));
        vectorRedactor.draw(shape);
    }
}
