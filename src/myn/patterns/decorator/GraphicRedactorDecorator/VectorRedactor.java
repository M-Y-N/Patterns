package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Class VectorRedactor draw shape
 */
public class VectorRedactor {

    /**
     * Empty constructor
     */
    VectorRedactor() {
    }

    /**
     * Draw shape on redactor
     *
     * @param shape - shape for drawing
     */
    public void draw(AbstractShape shape) {
        System.out.println("Draw shape with coordinate x = " + shape.getX() + " y = " + shape.getY() + " size = " + shape.getSize());
    }
}
