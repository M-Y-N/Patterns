package netcracker;

/**
 * @author Tsaruk Vova
 * @version 1.0
 * Головний клас Main для запуску програми
 */
public class Main {

    public static void main(String[] args) {
        SentenceContainer sentenceContainer = new SentenceContainer();
        Iterator iterator = sentenceContainer.getSentenceIterator();
        Iterator iterator1 = sentenceContainer.getFiltersIterator();
        System.out.println("___Sentence Iterator___");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("___Filters Iterator___");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}

