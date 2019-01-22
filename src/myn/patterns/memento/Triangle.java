package myn.patterns.memento;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Triangle реалізує клас BaseShape, створює трикутник
 */
public class Triangle extends BaseShape {
    /**
     * 1-ша сторона фігури
     */
    private int firstSide;

    /**
     * 2-га сторона фігури
     */
    private int secondSide;

    /**
     * 3-тя сторона фігури
     */
    private int thirdSide;

    /**
     * Конструктор, який приймає об'єкт для клонування
     *
     * @param triangle об'єкт для клонування
     */
    public Triangle(Triangle triangle) {
        super(triangle);
        this.firstSide = triangle.firstSide;
        this.secondSide = triangle.secondSide;
        this.thirdSide = triangle.thirdSide;
    }

    /**
     * Конструктор, який приймає дані фігури
     *
     * @param x          координата фігури
     * @param y          координата фігури
     * @param color      колір фігури
     * @param firstSide  перша сторона фігури
     * @param secondSide друга сторона фігури
     * @param thirdSide  третя сторона фігури
     */
    Triangle(int x, int y, Color color, int firstSide, int secondSide, int thirdSide) {
        super(x, y, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    /**
     * Метод, який змінює дані фігури
     *
     * @param x          координата фігури
     * @param y          координата фігури
     * @param color      колір фігури
     * @param firstSide  перша сторона фігури
     * @param secondSide друга сторона фігури
     * @param thirdSide  третя сторона фігури
     */
    public void setFields(int x, int y, Color color, int firstSide, int secondSide, int thirdSide) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    /**
     * Перевизнечений метод виводу
     *
     * @return інформацію про фігуру
     */
    @Override
    public String toString() {
        return "Triangle{" +
            "firstSide=" + firstSide +
            ", secondSide=" + secondSide +
            ", thirdSide=" + thirdSide +
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
        return new Triangle(this);
    }
}
