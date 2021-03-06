package myn.patterns.iterator.lab5_iterator;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Інтерфейс IPrivateCollection, з методом getIterator свого ітератора
 */

public interface IPrivateCollection {
    /**
     * Отримання ітератору
     *
     * @return повертає власний ітератор
     */
    Iteratorable getIterator();
}
