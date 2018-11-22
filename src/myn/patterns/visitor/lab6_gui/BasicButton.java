package myn.patterns.visitor.lab6_gui;

/**
 * @author Zaichenko Vasyl
 * Клас BasicButton який реалізує інтерфейс IElement
 */
public class BasicButton implements IElement {
    /**
     * Перевизначений метод прийняття відвідувача
     *
     * @param visitor - загальний відвідувач
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
