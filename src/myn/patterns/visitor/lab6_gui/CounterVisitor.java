package myn.patterns.visitor.lab6_gui;

/**
 * @author Zaichenko Vasyl
 * Клас CounterVisitor який реалізує конкретного відвідувача інтерфейса IVisitor
 */
public class CounterVisitor implements IVisitor {
    /**
     * Перемінні для зберігання кількості різних видів кнопок
     */
    private int countBasicButton;
    private int countBigButton;
    private int countGoldButton;
    private int countPanel;

    /**
     * Перевизначений метод відвідування елемента
     *
     * @param basicButton - елемент типу BasicButton
     */
    @Override
    public void visit(BasicButton basicButton) {
        countBasicButton++;
    }

    /**
     * Перевизначений метод відвідування елемента
     *
     * @param bigButton - елемент типу BigButton
     */
    @Override
    public void visit(BigButton bigButton) {
        countBigButton++;
    }

    /**
     * Перевизначений метод відвідування елемента
     *
     * @param goldButton - елемент типу GoldButton
     */
    @Override
    public void visit(GoldButton goldButton) {
        countGoldButton++;
    }

    /**
     * Перевизначений метод відвідування елемента
     *
     * @param panel - елемент типу Panel
     */
    @Override
    public void visit(Panel panel) {
        countPanel++;
    }

    /**
     * Вивід на консоль кількості елементів даного типу
     */
    @Override
    public String toString() {
        return "CounterVisitor{" +
                "countBasicButton=" + countBasicButton +
                ", countBigButton=" + countBigButton +
                ", countGoldButton=" + countGoldButton +
                ", countPanel=" + countPanel +
                '}';
    }
}
