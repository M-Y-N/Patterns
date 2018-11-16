/**
 * @author Zaichenko Vasyl
 * Клас Line який реалізує інтерфейс ILine
 */
public class Line implements ILine {
    /**
     * Координати лінії
     */
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    /**
     * Конструктор класу Line
     *
     * @param x1 - x координата першої точки
     * @param y1 - y координата першої точки
     * @param x2 - x координата другої точки
     * @param y2 - y координата другої точки
     */
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Перевизначений сетер x координати першої точки
     *
     * @param x1 - x координата першої точки
     */
    @Override
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * Перевизначений сетер y координати першої точки
     *
     * @param y1 - y координата першої точки
     */
    @Override
    public void setY1(double y1) {
        this.y1 = y1;
    }

    /**
     * Перевизначений сетер x координати другої точки
     *
     * @param x2 - x координата першої точки
     */
    @Override
    public void setX2(double x2) {
        this.x2 = x2;
    }

    /**
     * Перевизначений сетер y координати другої точки
     *
     * @param y2 - x координата першої точки
     */
    @Override
    public void setY2(double y2) {
        this.y2 = y2;
    }

    /**
     * Перевизначений метод малювання лінії
     */
    @Override
    public double drawLine() {
        System.out.println("Method draw in Line class");
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
