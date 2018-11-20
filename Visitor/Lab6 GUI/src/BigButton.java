/**
 * @author Zaichenko Vasyl
 * Клас BigButton який реалізує інтерфейс IElement
 */
public class BigButton implements IElement {
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
