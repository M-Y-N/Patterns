package myn.patterns.composite.lab3_2;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Абстрактний клас BaseShape який реалізує інтерфейс ShapeImpl
 */
abstract class BaseShape {
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Конструктор BaseShape з параметрами
     *
     * @param x      величина Х
     * @param y      величина У
     * @param width  ширина
     * @param height довжина
     */
    BaseShape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    /**
     * Гетер для Х
     *
     * @return повертає Х
     */
    public int getX() {
        return x;
    }

    /**
     * Гетер для Y
     *
     * @return повертає Y
     */
    public int getY() {
        return y;
    }

    /**
     * Гетер для width
     *
     * @return повертає width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Гетер для height
     *
     * @return повертає height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Вивід на екран
     */
    public void paint() {

    }

    public abstract CompoundShape add(BaseShape component);

}
