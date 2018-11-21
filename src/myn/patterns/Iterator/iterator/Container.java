package myn.patterns.Iterator.iterator;

/**
 * @author Tsaruk Vova
 * @version 1.0
 * Інтерфейс Container, з методоми getSentenceIterator та getFiltersIterator свого ітератора
 */
public interface Container {
    /**
     * Отримання ітератору
     *
     * @return повертає власний ітератор
     */
    Iterator getSentenceIterator();

    /**
     * Отримання ітератору
     *
     * @return повертає відфільтрований ітератор
     */
    Iterator getFiltersIterator();
}
