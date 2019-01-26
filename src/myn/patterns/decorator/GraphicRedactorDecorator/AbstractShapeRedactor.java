package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Abstract class AbstractShapeRedactor for work of shape
 */
public abstract class AbstractShapeRedactor {
    /**
     * Coordinate x of shape
     */
    public int x;
    /**
     * Coordinate y of shape
     */
    public int y;
    /**
     * Size shape
     */
    public int size;

    /**
     * Empty constructor
     */
    AbstractShapeRedactor() {
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
    AbstractShapeRedactor(int x, int y, int size) {

        this.x = x;
        this.y = y;
        this.size = size;
    }

    /**
     * Draw shape on redactor
     *
     * @param shape - shape for drawing
     */
    public abstract void draw(AbstractShapeRedactor shape);


    /**
     * Getter of coordinate x
     *
     * @return coordinate x
     */
    public int getX() {
        return x;
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
     * Getter of coordinate y
     *
     * @return coordinate y
     */
    public int getY() {
        return y;
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
     * Getter of size
     *
     * @return size
     */
    public int getSize() {
        return size;
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
