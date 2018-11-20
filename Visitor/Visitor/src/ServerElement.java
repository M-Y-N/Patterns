/**
 * @author Tsaruk Vova
 * Клас ServerElement який реалізує інтерфейс Element
 */
public class ServerElement implements Element {
    /**
     * priceServer ціна сервера
     */
    int priceServer;
    /**
     * Конструктор який встановлює ціну сервера
     */
    public ServerElement(int priceServer) {
        this.priceServer = priceServer;
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
