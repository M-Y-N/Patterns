package myn.patterns.Iterator.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
/**
 * @author Tsaruk Vova
 * @version 1.0
 * Клас SentenceContainer, реалізує Container
 */
public class SentenceContainer implements Container {
    /**
     * Приватна колекція до якої можна доступитися лише ітератором
     */
    private List<String> sentenceList = new ArrayList<>();

    /**
     * Приватний конструктор
     */
    public SentenceContainer() {
        sentenceList.add("Привіт");
        sentenceList.add("Як справи");
        sentenceList.add("Держава");
        sentenceList.add("Місто");
        sentenceList.add("Агрус");
    }

    /**
     * Отримання ітератору
     *
     * @return повертає власний ітератор
     */
    @Override
    public Iterator getSentenceIterator() {
        return new SentenceIterator();
    }

    /**
     * Отримання ітератору з фільтрацією
     *
     * @return повертає власний відфільтрований ітератор
     */
    @Override
    public Iterator getFiltersIterator() {
        return new FiltersIterator();
    }

    /**
     * @author Tsaruk Vova
     * @version 1.0
     * Клас SentenceIterator, реалізує свій ітератор
     */
    private class SentenceIterator implements Iterator {

        /**
         * Теперішній індекс ітератора
         */
        private int sentenceIndex;

        /**
         * Конструктор, ставить індекс на 0 елемент
         */
        private SentenceIterator() {
            sentenceIndex = 0;
        }

        /**
         * Наявність наступного елементу
         *
         * @return повертає наявність наступного елементу
         */
        @Override
        public boolean hasNext() {
            if (sentenceList.size() == 0)
                throw new NoSuchElementException();
            if (sentenceIndex < sentenceList.size())
                return true;
            return false;
        }

        /**
         * Доступ до елементу
         *
         * @return повертає елемент
         */
        @Override
        public Object next() {
            if (sentenceIndex > sentenceList.size())
                throw new NoSuchElementException();
            if (this.hasNext()) {
                return sentenceList.get(sentenceIndex++);
            }
            return null;
        }
    }

    /**
     * @author Tsaruk Vova
     * @version 1.0
     * Клас SentenceIterator, реалізує свій ітератор
     */
    private class FiltersIterator implements Iterator {
        /**
         * Теперішній індекс ітератора
         */
        private int filterIndex;
        /**
         * Приватна копія колекції до якої можна доступитися лише ітератором
         */
        private List<String> sentenceList1 = new ArrayList<>();

        /**
         * Конструктор, ставить індекс на 0 елемент та робить копію ліста
         */
        private FiltersIterator() {
            filterIndex = 0;
            sentenceList1.addAll(0, sentenceList);
            filter();
        }

        /**
         * Метод filter,який фільтрує в алфавітному порядку
         */
        private void filter() {

            Collections.sort(sentenceList1);
        }

        /**
         * Наявність наступного елементу
         *
         * @return повертає наявність наступного елементу
         */
        @Override
        public boolean hasNext() {
            if (sentenceList1.size() == 0)
                throw new NoSuchElementException();
            if (filterIndex < sentenceList1.size())
                return true;
            return false;
        }

        /**
         * Доступ до елементу
         *
         * @return повертає елемент
         */
        @Override
        public Object next() {
            if (filterIndex > sentenceList1.size())
                throw new NoSuchElementException();
            if (this.hasNext()) {
                return sentenceList1.get(filterIndex++);
            }
            return null;
        }
    }
}
