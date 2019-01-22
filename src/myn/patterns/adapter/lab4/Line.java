package myn.patterns.adapter.lab4;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Line який реалізує ILine з виводом на екран лінії
 */
public class Line implements ILine {
    /**
     * Пустий конструктор
     */
    public Line() {
    }

    /**
     * Реалізований вивід на екран лінії
     */
    @Override
    public void draw(double x1, double y1, double x2, double y2, String coordinate) {
        System.out.println("Draw line : x1 = " + x1 + " & y1 = " + y1 + " & x2 = " + x2 + " & y2 = " + y2 +
            " In " + coordinate + " system coordinate");
    }
}
