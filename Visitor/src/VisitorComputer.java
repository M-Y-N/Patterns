/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас VisitorComputer реалізує інтерфейс IVisitor, створює візітора
 */
public class VisitorComputer implements IVisitor {

    /**
     * Потужність всього компютера
     */
    private double totalPower = 0;

    /**
     * Пустий конструктор
     */
    VisitorComputer() {
    }

    /**
     * Повертає повністю потужність компютера
     *
     * @return потужність всього компютера
     */
    private double getTotalPower() {
        return totalPower;
    }

    /**
     * Метод для відвідування візітора в Computer
     *
     * @param computer обєкт Computer для відвідування
     */
    @Override
    public void visit(Computer computer) {
        System.out.println("Visit computer");
        totalPower += computer.getPower();
    }

    /**
     * Метод для відвідування візітора в Memory
     *
     * @param memory обєкт Memory для відвідування
     */
    @Override
    public void visit(Memory memory) {
        System.out.println("Visit memory");
        totalPower += memory.getPower();
    }

    /**
     * Метод для відвідування візітора в Processor
     *
     * @param processor обєкт Processor для відвідування
     */
    @Override
    public void visit(Processor processor) {
        System.out.println("Visit processor");
        totalPower += processor.getPower();
    }

    /**
     * Метод для відвідування візітора в VideoCard
     *
     * @param videoCard обєкт VideoCard для відвідування
     */
    @Override
    public void visit(VideoCard videoCard) {
        System.out.println("Visit videoCard");
        totalPower += videoCard.getPower();
    }

    /**
     * Вивід потужності компютера
     */
    public void printTotalPower() {
        System.out.println("Total power of system is " + getTotalPower());
    }
}
