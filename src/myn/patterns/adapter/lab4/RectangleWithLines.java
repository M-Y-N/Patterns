package myn.patterns.adapter.lab4;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Adapter який реалізує IRectangle та має обєкти класу Line, що
 * допомагає "адаптувати" вивід прямокутника за допомогою ліній
 */
public class RectangleWithLines extends Line implements IRectangle {

    /**
     * Координати ліній, розмір екрану та агрегація обєктів Line
     */
    private double x1, y1, x2, y2;
    private double widthMonitor = 200;

    /**
     * Конструктор Adapter з параметрами
     *
     * @param x1 величина Х1
     * @param y1 величина У1
     * @param x2 величина Х2
     * @param y2 величина Y23
     */
    public RectangleWithLines(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Адаптований вивід на екран прямокутника за допомогою ліній
     */
    @Override
    public void draw() {
        String coordinate = "second";
        double x1 = widthMonitor / 2 + this.x1;
        double x2 = widthMonitor / 2 + this.x2;
        double y1 = -this.y1;
        double y2 = -this.y2;

        System.out.println("Rectangle consist of : ");
        draw(x1, y1, x2, y1, coordinate);
        draw(x2, y1, x2, y2, coordinate);
        draw(x2, y2, x1, y2, coordinate);
        draw(x1, y2, x1, y1, coordinate);

    }
}
