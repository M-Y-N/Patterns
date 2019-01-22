package myn.patterns.composite.lab3_2;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Circle який наслідується від Dot
 */
public class Circle extends Dot {
    /**
     * Конструктор Circle з параметрами
     *
     * @param x      величина Х
     * @param y      величина У
     * @param width  ширина
     * @param height довжина
     */

    public Circle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /**
     * Вивід на екран
     */
    @Override
    public void paint() {
        System.out.println(String.format("Paint CIRCLE with parametrs : X = %s, Y = %s, Width = %s, Height = %s.",
            getX(), getY(), getWidth(), getHeight()));
    }
}
