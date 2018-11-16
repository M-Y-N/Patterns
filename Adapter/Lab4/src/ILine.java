/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Інтерфейс ILine, з методом draw лінії
 */
public interface ILine {
    /**
     * Вивід на екран лінії
     */
    void draw(double x1, double y1, double x2, double y2, String coordinate);
}
