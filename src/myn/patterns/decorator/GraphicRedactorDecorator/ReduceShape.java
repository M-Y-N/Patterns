package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Decorator class ReduceShape extends AbstractShape for reduce shape
 */
public class ReduceShape extends AbstractShape {
    /**
     * Constructor for creating shape with parameters
     *
     * @param shape - shape for clone
     */
    ReduceShape(AbstractShape shape) {
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
        return shapeClone.getY();
    }

    /**
     * Getter of size
     *
     * @return size
     */
    @Override
    public int getSize() {
        return shapeClone.getSize() / 2;
    }
}
