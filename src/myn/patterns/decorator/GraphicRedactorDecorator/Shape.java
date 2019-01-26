package myn.patterns.decorator.GraphicRedactorDecorator;

/**
 * @author Zaichenko Ivan
 * Abstract class Shape for work of shape
 */
public interface Shape {

    /**
     * Abstract Getter of coordinate x
     *
     * @return coordinate x
     */
    int getX();

    /**
     * Abstract Getter of coordinate y
     *
     * @return coordinate y
     */
    int getY();

    /**
     * Getter of size
     *
     * @return size
     */
    int getSize();
}
