/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Processor реалізує інтерфейс IElementOfComputers, створює елемет процесора
 */
public class Processor implements IElementOfComputers {
    /**
     * Потужність процесора
     */
    private double power;

    /**
     * Повертає потужність процесора
     *
     * @return потужність всього компютера
     */
    public double getPower() {
        return power;
    }

    /**
     * Пустий конструктор
     */
    public Processor() {
        power = 100.5;
    }

    /**
     * Конструктор, який приймає потужність
     *
     * @param power потужність елемента
     */
    public Processor(double power) {
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
