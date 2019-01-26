package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Decorator class MoveUpShape extends AbstractShape for move up shape
 */
public class MoveUpShape extends AbstractShape {

    /**
     * Constructor for creating shape with parameters
     *
     * @param shape - shape for clone
     */
    MoveUpShape(AbstractShape shape) {
        super(shape);
    }

    /**
     * Abstract Getter of coordinate x
     *
     * @return coordinate x
     */
    @Override
    public int getX() {
        return shapeClone.getX();
    }

    /**
     * Abstract Getter of coordinate y
     *
     * @return coordinate y
     */
    @Override
    public int getY() {
        return shapeClone.getY() + 10;
    }

    /**
     * Getter of size
     *
     * @return size
     */
    @Override
    public int getSize() {
        return shapeClone.getSize();
    }
}
