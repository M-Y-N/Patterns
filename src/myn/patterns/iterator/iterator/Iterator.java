package myn.patterns.iterator.iterator;

/**
 * @author Tsaruk Vova
 * @version 1.0
 * Інтерфейс Iterator, для реалізації свого ітератора
 */
public interface Iterator {
    /**
     * Наявність наступного елементу
     *
     * @return повертає наявність наступного елементу
     */
    boolean hasNext();

    /**
     * Доступ до елементу
     *
     * @return повертає елемент
     */
    Object next();

}
