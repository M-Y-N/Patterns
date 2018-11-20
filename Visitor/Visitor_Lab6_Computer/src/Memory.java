/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Memory реалізує інтерфейс IElementOfComputers, створює елемет память
 */
public class Memory implements IElementOfComputers {
    /**
     * Потужність памяті
     */
    private double power;

    /**
     * Повертає потужність памяті
     *
     * @return потужність всього компютера
     */
    public double getPower() {
        return power;
    }

    /**
     * Пустий конструктор
     */
    public Memory() {
        power = 100.5;
    }

    /**
     * Конструктор, який приймає потужність
     *
     * @param power потужність елемента
     */
    Memory(double power) {
        this.power = power;
    }

    /**
     * Метод для дозволу ввійти візітору
     *
     * @param visitor візітор
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
