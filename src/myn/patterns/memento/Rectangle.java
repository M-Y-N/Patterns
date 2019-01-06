package myn.patterns.memento;
/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Rectangle реалізує клас BaseShape, створює прямокутник
 */
public class Rectangle extends BaseShape {
    /**
     * Довжина фігури
     */
    private int length;

    /**
     * Ширина фігури
     */
    private int width;

    /**
     * Kонструктор, який приймає обєкт для клонування
     *
     * @param rectangle обєкт для клонування
     */
    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    /**
     * Конструктор, який приймає дані фігури
     *
     * @param x      координата фігури
     * @param y      координата фігури
     * @param color  колір фігури
     * @param length довжина фігури
     * @param width  ширина фігури
     */
    Rectangle(int x, int y, Color color, int length, int width) {
        super(x, y, color);
        this.length = length;

        this.width = width;
    }

    /**
     * Метод, який змінює дані фігури
     *
     * @param x      координата фігури
     * @param y      координата фігури
     * @param color  колір фігури
     * @param length довжина фігури
     * @param width  ширина фігури
     */
    public void setFields(int x, int y, Color color, int length, int width) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    /**
     * Перевизнечений метод виводу
     *
     * @return інформацію про фігуру
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }

    /**
     * Копіювання елемента
     *
     * @return копію елемента
     */
    @Override
    protected BaseShape clone() {
        return new Rectangle(this);
    }


}
