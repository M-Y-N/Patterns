package myn.patterns.Adapter.lab4;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Rectangle який реалізує IRectangle з виводом на екеран прямокутника цілим
 */
public class Rectangle implements IRectangle {
    /**
     * Пустий конструктор
     */
    public Rectangle() {
    }

    /**
     * Реалізований вивід на екран прямокутника без допомоги ліній
     */
    @Override
    public void draw() {
        System.out.println("Draw rectangle right away");
    }
}
