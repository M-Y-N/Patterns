/**
 * @author Zaichenko Vasyl
 * Інтерфейс для точки
 */
public interface IDot {
    /**
     * Сетер x координати
     *
     * @param x - x координата точки
     */
    void setX(int x);

    /**
     * Сетер y координати
     *
     * @param y - y координата точки
     */
    void setY(int y);
    void draw(int x, int y);
}
