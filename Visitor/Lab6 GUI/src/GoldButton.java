/**
 * @author Zaichenko Vasyl
 * Клас GoldButton який реалізує інтерфейс IElement
 */
public class GoldButton implements IElement {
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
