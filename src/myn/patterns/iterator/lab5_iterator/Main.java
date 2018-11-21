package myn.patterns.iterator.lab5_iterator;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Головний клас Main для запуску програми
 */
public class Main {

    public static void main(String[] args) {

        PrivateCollection privateCollection = new PrivateCollection();
        Iteratorable iterator = privateCollection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
