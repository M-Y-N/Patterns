package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Class ShapeRedactor extends AbstractShapeRedactor for create shape
 */
public class ShapeRedactor extends AbstractShapeRedactor {
    /**
     * Empty constructor
     */
    public ShapeRedactor() {
    }

    /**
     * Constructor for creating shape with parameters
     *
     * @param x    - x coordinate
     * @param y    - y coordinate
     * @param size size shape
     */
    ShapeRedactor(int x, int y, int size) {
        super(x, y, size);
    }

    /**
     * Draw shape on redactor
     *
     * @param shape - shape for drawing
     */
    @Override
    public void draw(AbstractShapeRedactor shape) {
        System.out.println("Draw shape with coordinate x = " + x + " y = " + y + " size = " + size);
    }

}
