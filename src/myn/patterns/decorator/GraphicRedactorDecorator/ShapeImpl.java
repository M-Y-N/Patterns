package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Class ShapeImpl extends Shape for creating shapes
 */
public class ShapeImpl implements Shape {
    /**
     * Coordinate x of shape
     */
    private int x = 0;
    /**
     * Coordinate y of shape
     */
    private int y = 0;
    /**
     * Size shape
     */
    private int size = 0;

    /**
     * Empty constructor
     */
    public ShapeImpl() {
    }

    /**
     * Constructor for creating shape with parameters
     *
     * @param x    - x coordinate
     * @param y    - y coordinate
     * @param size size shape
     */
    ShapeImpl(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
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

    /**
     * Setter of coordinate x
     *
     * @param x set coordinate x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Setter of coordinate y
     *
     * @param y set coordinate y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Setter of size
     *
     * @param size set size
     */
    public void setSize(int size) {
        this.size = size;
    }
}
