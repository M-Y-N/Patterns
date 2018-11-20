/**
 * @author Tsaruk Vova
 * Інтерфейс для елементів, яких потрібно відвідати
 */
public interface Element {
    /**
     * Метод який приймає відвідувача
     *
     * @param visitor - загальний відвідувач
     */
    void accept(Visitor visitor);
}
