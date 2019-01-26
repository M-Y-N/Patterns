package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Abstract class AbstractShape for work of shape
 */
public abstract class AbstractShape {
    /**
     * Coordinate x of shape
     */
    protected int x;
    /**
     * Coordinate y of shape
     */
    protected int y;
    /**
     * Size shape
     */
    protected int size;
    /**
     * Clone of shape for change parameters for drawing
     */
    AbstractShape shapeClone;

    /**
     * Empty constructor
     */
    AbstractShape() {
        x = 0;
        y = 0;
        size = 0;
    }

    /**
     * Constructor for creating shape with parameters
     *
     * @param x    - x coordinate
     * @param y    - y coordinate
     * @param size size shape
     */
    AbstractShape(int x, int y, int size) {

        this.x = x;
        this.y = y;
        this.size = size;
    }

    /**
     * Constructor for creating shape with parameters
     *
     * @param shape- shape for clone
     */
    AbstractShape(AbstractShape shape) {
        this.shapeClone = shape;
    }

    /**
     * Abstract Getter of coordinate x
     *
     * @return coordinate x
     */
    public abstract int getX();

    /**
     * Abstract Getter of coordinate y
     *
     * @return coordinate y
     */
    public abstract int getY();

    /**
     * Getter of size
     *
     * @return size
     */
    public abstract int getSize();

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
