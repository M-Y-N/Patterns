/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Інтерфейс IElementOfComputers, з методом accept для дозволу ввійти візітору
 */
public interface IElementOfComputers {

    /**
     * Метод для дозволу ввійти візітору
     *
     * @param visitor візітор
     */
    void accept(IVisitor visitor);
}
