/**
 * @author Zaichenko Vasyl
 * Клас Dot який реалізує інтерфейс IDot
 */
public class Dot implements IDot {
    /**
     * Координати точки
     */
    private int x;
    private int y;

    /**
     * Конструктор класу Dot
     *
     * @param x - x координата точки
     * @param y - y координата точки
     */
    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Пустий конструктор
     */
    public Dot() {
    }

    /**
     * Гетер координати x
     */
    public int getX() {
        return x;
    }

    /**
     * Гетер координати y
     */
    public int getY() {
        return y;
    }

    /**
     * Перевизначений сетер x координати
     *
     * @param x - x координата точки
     */
    @Override
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Перевизначений сетер y координати
     *
     * @param y - y координата точки
     */
    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Method draw in Dot class");
        System.out.println("Dot in pixel: ("+x+", "+y+")");
    }
}
