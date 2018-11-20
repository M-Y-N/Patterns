/**
 * @author Tsaruk Vova
 * Клас CableElement який реалізує інтерфейс Element
 */
public class CableElement implements Element {
    /**
     * priceCable ціна кабеля
     */
    int priceCable;
    /**
     * Конструктор який встановлює ціну кабеля
     */
    public CableElement(int priceCable) {
        this.priceCable = priceCable;
    }
    /**
     * Перевизначений метод прийняття відвідувача
     *
     * @param visitor - загальний відвідувач
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
