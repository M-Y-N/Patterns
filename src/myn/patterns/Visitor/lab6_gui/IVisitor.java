package myn.patterns.visitor.lab6_gui;

/**
 * @author Zaichenko Vasyl
 * Інтерфейс відвідувача, який має 4 перевизначені методи
 */
public interface IVisitor {
    /**
     * Метод відвідування елемента
     *
     * @param basicButton - елемент типу BasicButton
     */
    void visit(BasicButton basicButton);

    /**
     * Метод відвідування елемента
     *
     * @param bigButton - елемент типу BigButton
     */
    void visit(BigButton bigButton);

    /**
     * Метод відвідування елемента
     *
     * @param goldButton - елемент типу GoldButton
     */
    void visit(GoldButton goldButton);

    /**
     * Метод відвідування елемента
     *
     * @param panel - елемент типу Panel
     */
    void visit(Panel panel);
}
