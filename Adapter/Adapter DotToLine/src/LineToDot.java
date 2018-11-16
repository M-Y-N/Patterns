/**
 * @author Zaichenko Vasyl
 * Клас Adapter який реалізує ILine та має обєкти класу Dot
 */
public class LineToDot extends Dot implements ILine  {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private int x1Dot;
    private int y1Dot;
    private int x2Dot;
    private int y2Dot;
    /**
     * Обєкти класу точки
     */
    private int smToPixel = 38;

    /**
     * Конструктор адаптера
     *
     * @param dot1 - перша точка лінії
     * @param dot2 - остання точка лінії
     */
    public LineToDot(Dot dot1, Dot dot2) {
        setX1((double) dot1.getX());
        setY1((double) dot1.getY());
        setX2((double) dot2.getX());
        setY2((double) dot2.getY());
    }

    /**
     * Конструктор адаптера
     *
     * @param x1 - x координата першої точки
     * @param y1 - y координата першої точки
     * @param x2 - x координата останньої точки
     * @param y2 - y координата останньої точки
     */
    public LineToDot(double x1, double y1, double x2, double y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    /**
     * Адаптований і перевизначений сетер x координати першої точки
     *
     * @param x - x координата першої точки
     */
    @Override
    public void setX1(double x) {
        x1Dot = (int)x;
        int xInt = (int) x / smToPixel;
        setX(xInt);
        x1 = getX();
    }

    /**
     * Адаптований і перевизначений сетер y координати першої точки
     *
     * @param y - y координата першої точки
     */
    @Override
    public void setY1(double y) {
        y1Dot = (int)y;
        int yInt = (int) y / smToPixel;
        setY(yInt);
        y1 = getY();
    }

    /**
     * Адаптований і перевизначений сетер x координати останньої точки
     *
     * @param x - x координата останньої точки
     */
    @Override
    public void setX2(double x) {
        x2Dot = (int)x;
        int xInt = (int) x / smToPixel;
        setX(xInt);
        x2 = getX();
    }

    /**
     * Адаптований і перевизначений сетер y координати останньої точки
     *
     * @param y - y координата останньої точки
     */
    @Override
    public void setY2(double y) {
        y2Dot = (int)y;
        int yInt = (int) y / smToPixel;
        setY(yInt);
        y2 = getY();
    }

    /**
     * Адаптований і перевизначений метод малювання лінії
     */
    @Override
    public double drawLine() {
        System.out.println("Method draw in Adapter class");
        draw(x1Dot, y1Dot);
        draw(x2Dot, y2Dot);
        System.out.println("First Dot in sm : (" +x1+ ", "+y1+")");
        System.out.println("Second Dot in sm : (" +x2+ ", "+y2+")");
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }
}
