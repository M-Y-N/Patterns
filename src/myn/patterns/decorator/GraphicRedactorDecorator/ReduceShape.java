package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Decorator class ReduceShape extends AbstractShapeRedactor for reduce shape
 */
public class ReduceShape extends AbstractShapeRedactor {
    /**
     * Clone of shape for change parameters for drawing
     */
    AbstractShapeRedactor shapeClone;

    /**
     * Constructor for creating shape with parameters
     *
     * @param shape- shape for clone
     */
    ReduceShape(AbstractShapeRedactor shape) {
        this.shapeClone = shape;
    }

    /**
     * Decorator method for reduce of shape for drawing
     *
     * @param shape - shape for drawing
     */
    @Override
    public void draw(AbstractShapeRedactor shape) {
        shapeClone.x = shape.x;
        shapeClone.y = shape.y;
        shapeClone.size = shape.size;
        shapeClone.size = shapeClone.size / 2;
        shapeClone.draw(shapeClone);
    }
}
