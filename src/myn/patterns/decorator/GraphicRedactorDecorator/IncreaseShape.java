package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Decorator class IncreaseShape extends Shape for increase shape
 */
public class IncreaseShape extends AbstractDecoratorShape {

    /**
     * Constructor for creating shape with parameters
     *
     * @param shape - shape for clone
     */
    IncreaseShape(Shape shape) {
        super(shape);
    }

    /**
     * Abstract Getter of coordinate x
     *
     * @return coordinate x
     */
    @Override
    public int getX() {
        return next.getX();
    }

    /**
     * Abstract Getter of coordinate y
     *
     * @return coordinate y
     */
    @Override
    public int getY() {
        return next.getY();
    }

    /**
     * Getter of size
     *
     * @return size
     */
    @Override
    public int getSize() {
        return next.getSize() * 5;
    }
}
