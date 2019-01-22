package myn.patterns.visitor.lab6_computer;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас Computer реалізує інтерфейс IElementOfComputers, створює елемет компютер
 */
public class Computer implements IElementOfComputers {
    /**
     * Потужність компютера
     */
    private double power;
    /**
     * Список всіх елементів у компютері
     */
    private IElementOfComputers[] elements;

    /**
     * Повертає потужність компютера
     *
     * @return потужність всього компютера
     */
    public double getPower() {
        return power;
    }

    /**
     * Пустий конструктор, який ініціалізує список елементів для компютера
     */
    Computer() {
        power = 100.5;
        this.elements = new IElementOfComputers[]{
            new Memory(30),
            new Processor(50),
            new VideoCard(40)
        };
    }

    /**
     * Конструктор, який приймає потужність та ініціалізує список елементів для компютера
     *
     * @param power потужність елемента
     */
    public Computer(double power) {
        this.power = power;
        this.elements = new IElementOfComputers[]{
            new Memory(30),
            new Processor(50),
            new VideoCard(40)
        };
    }

    /**
     * Метод для дозволу ввійти візітору для всіх елементыв компютера і його самого
     *
     * @param visitor візітор
     */
    @Override
    public void accept(IVisitor visitor) {
        for (IElementOfComputers elementsOfComputer : elements
        ) {
            elementsOfComputer.accept(visitor);
        }
        visitor.visit(this);
    }

}
