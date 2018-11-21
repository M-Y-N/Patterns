package myn.patterns.visitor.lab6_computer;
/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас VideoCard реалізує інтерфейс IElementOfComputers, створює елемет відеокарти
 */
public class VideoCard implements IElementOfComputers {
    /**
     * Потужність відеокарти
     */
    private double power;

    /**
     * Повертає потужність відеокарти
     *
     * @return потужність всього компютера
     */
    public double getPower() {
        return power;
    }

    /**
     * Пустий конструктор
     */
    public VideoCard() {
        power = 100.5;
    }

    /**
     * Конструктор, який приймає потужність
     *
     * @param power потужність елемента
     */
    public VideoCard(double power) {
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
