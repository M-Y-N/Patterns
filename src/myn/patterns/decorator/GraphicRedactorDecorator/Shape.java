package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Class Shape extends AbstractShape for create shape
 */
public class Shape extends AbstractShape {
    /**
     * Empty constructor
     */
    public Shape() {
    }

    /**
     * Constructor for creating shape with parameters
     *
     * @param x    - x coordinate
     * @param y    - y coordinate
     * @param size size shape
     */
    Shape(int x, int y, int size) {
        super(x, y, size);
    }

    /**
     * Abstract Getter of coordinate x
     *
     * @return coordinate x
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     * Abstract Getter of coordinate y
     *
     * @return coordinate y
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     * Getter of size
     *
     * @return size
     */
    @Override
    public int getSize() {
        return size;
    }
}
