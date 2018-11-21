package myn.patterns.Composite.lab3_2;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Dot який наслідується від BaseShape
 */
public class Dot extends BaseShape {
    /**
     * Конструктор Circle з параметрами
     *
     * @param x      величина Х
     * @param y      величина У
     * @param width  ширина
     * @param height довжина
     */
    public Dot(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /**
     * Вивід на екран
     */
    @Override
    public void paint() {
        System.out.println(String.format("Paint DOT with parametrs : X = %s, Y = %s, Width = %s, Height = %s.",
                getX(), getY(), getWidth(), getHeight()));
    }

//    /**
//     * Видаляє обєкти в контейнері
//     *
//     * @param child обєкти для видаження в контейнері
//     */
//    @Override
//    public CompoundShape remove(BaseShape child) {
//        return new CompoundShape(this,child);
//    }

    /**
     * Додає обєкт в контейнер
     *
     * @param component обєкт для додання в контейнер
     */
    @Override
    public CompoundShape add(BaseShape component) {

        return new CompoundShape(this,component);
    }

}