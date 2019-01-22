package myn.patterns.memento;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Square реалізує клас BaseShape, створює квадрат
 */
public class Square extends BaseShape {
    /**
     * Сторона фігури
     */
    private int side;

    /**
     * Конструктор, який приймає об'єкт для клонування
     *
     * @param square об'єкт для клонування
     */
    public Square(Square square) {
        super(square);
        this.side = square.side;
    }

    /**
     * Конструктор, який приймає дані фігури
     *
     * @param x     координата фігури
     * @param y     координата фігури
     * @param color колір фігури
     * @param side  сторона фігури
     */
    Square(int x, int y, Color color, int side) {
        super(x, y, color);
        this.side = side;
    }

    /**
     * Метод, який змінює дані фігури
     *
     * @param x     координата фігури
     * @param y     координата фігури
     * @param color колір фігури
     * @param side  сторона фігури
     */
    public void setFields(int x, int y, Color color, int side) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.side = side;
    }


    /**
     * Перевизнечений метод виводу
     *
     * @return інформацію про фігуру
     */
    @Override
    public String toString() {
        return "Square{" +
            "side=" + side +
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
        return new Square(this);
    }
}
