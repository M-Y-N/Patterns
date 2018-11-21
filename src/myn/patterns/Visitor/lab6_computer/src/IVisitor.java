package myn.patterns.Visitor.lab6_computer.src;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Інтерфейс IVisitor, з методоми visit для всіх компонентів компютера
 */
public interface IVisitor {
    /**
     * Метод для відвідування візітора в Computer
     *
     * @param computer обєкт Computer для відвідування
     */
    void visit(Computer computer);

    /**
     * Метод для відвідування візітора в Memory
     *
     * @param memory обєкт Memory для відвідування
     */
    void visit(Memory memory);

    /**
     * Метод для відвідування візітора в Processor
     *
     * @param processor обєкт Processor для відвідування
     */
    void visit(Processor processor);

    /**
     * Метод для відвідування візітора в VideoCard
     *
     * @param videoCard обєкт VideoCard для відвідування
     */
    void visit(VideoCard videoCard);
}
