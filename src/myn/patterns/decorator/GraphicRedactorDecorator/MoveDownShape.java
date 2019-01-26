package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Decorator class MoveUpShape extends AbstractShapeRedactor for move down shape
 */
public class MoveDownShape extends AbstractShapeRedactor {
    /**
     * Clone of shape for change parameters for drawing
     */
    AbstractShapeRedactor shapeClone;

    /**
     * Constructor for creating shape with parameters
     *
     * @param shape- shape for clone
     */
    MoveDownShape(AbstractShapeRedactor shape) {
        this.shapeClone = shape;
    }

    /**
     * Decorator method for move down of shape for drawing
     *
     * @param shape - shape for drawing
     */
    @Override
    public void draw(AbstractShapeRedactor shape) {
        shapeClone.x = shape.x;
        shapeClone.y = shape.y;
        shapeClone.size = shape.size;
        shapeClone.y = shapeClone.y - 3;
        shapeClone.draw(shapeClone);
    }
}
