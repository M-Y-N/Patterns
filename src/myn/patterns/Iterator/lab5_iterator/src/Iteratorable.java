package myn.patterns.Iterator.lab5_iterator.src;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Інтерфейс Iteratorable, для реалізації свого ітератора
 */

public interface Iteratorable {
    /**
     * Доступ до елементу
     *
     * @return повертає елемент
     */
    Object next();

    /**
     * Наявність наступного елементу
     *
     * @return повертає наявність наступного елементу
     */
    boolean hasNext();

    /**
     * Доступ до минулого елементу
     *
     * @return повертає минулий елемент
     */
    Object previous();

    /**
     * Наявність минулого елементу
     *
     * @return повертає наявність минулого елементу
     */
    boolean hasPrevious();
}
