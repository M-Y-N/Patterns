/**
 * @author Zaichenko Vasyl
 * Інтерфейс для малювання лінії
 */
public interface ILine {
    /**
     * Сетер x координати першої точки
     *
     * @param x1 - x координата першої точки
     */
    void setX1(double x1);

    /**
     * Сетер y координати першої точки
     *
     * @param y1 - y координата першої точки
     */
    void setY1(double y1);

    /**
     * Сетер x координати другої точки
     *
     * @param x2 - x координата першої точки
     */
    void setX2(double x2);

    /**
     * Сетер y координати другої точки
     *
     * @param y2 - x координата першої точки
     */
    void setY2(double y2);

    /**
     * Метод малювання лінії
     */
    double drawLine();
}
