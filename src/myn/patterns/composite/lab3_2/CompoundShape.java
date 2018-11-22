package myn.patterns.composite.lab3_2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас CompoundShape який наслідується від BaseShape - контейнер для зберігання.
 * Контейнер містить операції додавання/видалення дочірніх
 * компонентів. Усі стандартні операції інтерфейсу компонентів
 * він делегує кожному з дочірніх компонентів.
 */
public class CompoundShape extends BaseShape {
    private List<BaseShape> children = new ArrayList<>();

    /**
     * Конструктор CompoundShape з параметрами
     *
     * @param components обєкти для запису в контейнер
     */
    public CompoundShape(BaseShape... components) {
        super(0, 0, 0, 0);
        add(components);
    }

    /**
     * Додає обєкт в контейнер
     *
     * @param component обєкт для додання в контейнер
     */
    @Override
    public CompoundShape add(BaseShape component) {
        children.add(component);
        return this;
    }

    /**
     * Додає обєкти в контейнер
     *
     * @param components обєкти для додання в контейнер
     */

    public void add(BaseShape... components) {
        children.addAll(Arrays.asList(components));
    }

    /**
     * Видаляє обєкти в контейнері
     *
     * @param child обєкти для видаження в контейнері
     */

    public CompoundShape remove(BaseShape child) {
        int i = children.indexOf(child);
        children.remove(i);
        return this;
    }

    /**
     * Видаляє обєкти в контейнері
     *
     * @param components обєкти для видаження в контейнері
     */

    public void remove(BaseShape... components) {
        children.removeAll(Arrays.asList(components));
    }

    /**
     * Гетер для Х
     *
     * @return повертає Х контейнера
     */
    @Override
    public int getX() {
        if (children.size() == 0) {
            return 0;
        }
        int x = children.get(0).getX();
        for (BaseShape child : children) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    /**
     * Гетер для Y
     *
     * @return повертає Y контейнера
     */
    @Override
    public int getY() {
        if (children.size() == 0) {
            return 0;
        }
        int y = children.get(0).getY();
        for (BaseShape child : children) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    /**
     * Гетер для width
     *
     * @return повертає width контейнера
     */
    @Override
    public int getWidth() {
        int minX = getX();
        int maxX = getX();
        for (BaseShape child : children) {
            if ((child.getX() + child.getWidth()) > maxX) {
                maxX = child.getX() + child.getWidth();
            }

        }
        return maxX - minX;
    }

    /**
     * Гетер для height
     *
     * @return повертає height контейнера
     */
    @Override
    public int getHeight() {
        int minY = getY();
        int maxY = getY();
        for (BaseShape child : children) {
            if ((child.getY() + child.getHeight()) > maxY) {
                maxY = child.getY() + child.getHeight();
            }

        }
        return maxY - minY;
    }

    /**
     * Вивід на екран вмісту контейнера
     */
    @Override
    public void paint() {
        System.out.println();
        System.out.println("CompoundShape start: ");
        System.out.println(String.format("Paint CompoundShape with parametrs : X = %s, Y = %s, Width = %s, Height = %s.",
                getX(), getY(), getWidth(), getHeight()));
        System.out.println("CompoundShape consist of this components :");
        for (BaseShape child : children) {
            child.paint();
        }
        System.out.println("CompoundShape end. ");
        System.out.println();
    }
}