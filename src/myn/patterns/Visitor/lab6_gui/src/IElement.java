package myn.patterns.Visitor.Lab6

/**
 * @author Zaichenko Vasyl
 * Інтерфейс для елементів, яких потрібно відвідати
 */
public interface IElement {
    /**
     * Метод прийняття відвідувача
     *
     * @param visitor - загальний відвідувач
     */
    void accept(IVisitor visitor);
}
