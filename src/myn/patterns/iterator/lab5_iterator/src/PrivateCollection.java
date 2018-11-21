package myn.patterns.iterator.lab5_iterator.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас PrivateCollection який реалізує IPrivateCollection з внутрішнім класом ListIter
 */
public class PrivateCollection implements IPrivateCollection {
    /**
     * Приватна колекція до якої можна доступитися лише ітератором
     */
    private ArrayList<Object> list = new ArrayList<>(
            Arrays.asList("1KPI", null, "2Uman", "3IP-64", null, "4Java"));

    /**
     * Пустий конструктор
     */
    PrivateCollection() {
    }

    /**
     * Отримання ітератору
     *
     * @return повертає власний ітератор
     */
    @Override
    public Iteratorable getIterator() {
        return new ListIter();
    }

    /**
     * @author Ivan Zaichenko
     * @version 1.0
     * Клас ListIter, реалізує свій ітератор
     */
    private class ListIter implements Iteratorable {
        /**
         * Теперішній індекс ітератора
         */
        private int currentIndex;

        /**
         * Конструктор, ставить індекс на 0 елемент
         */
        ListIter() {
            currentIndex = 0;
        }

        /**
         * Доступ до елементу
         *
         * @return повертає елемент
         */
        @Override
        public Object next() {
            if (currentIndex >= list.size())
                throw new NoSuchElementException();
            if (list.get(currentIndex) == null) {
                currentIndex++;
                return next();
            }
            return list.get(currentIndex++);
        }

        /**
         * Наявність наступного елементу
         *
         * @return повертає наявність наступного елементу
         */
        @Override
        public boolean hasNext() {
            return currentIndex < list.size();
        }

        /**
         * Доступ до минулого елементу
         *
         * @return повертає минулий елемент
         */
        @Override
        public Object previous() {
            if ((currentIndex - 1) < 0)
                throw new NoSuchElementException();
            if (list.get(currentIndex - 1) == null) {
                currentIndex--;
                return previous();
            }
            return list.get(--currentIndex);
        }

        /**
         * Наявність минулого елементу
         *
         * @return повертає наявність минулого елементу
         */
        @Override
        public boolean hasPrevious() {
            return currentIndex > 0;
        }
    }
}
