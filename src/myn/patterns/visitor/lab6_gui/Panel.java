package myn.patterns.visitor.lab6_gui;

import java.util.ArrayList;

/**
 * @author Zaichenko Vasyl
 * Клас Panel який реалізує інтерфейс IElement
 */
public class Panel implements IElement {
    /**
     * Ліст кнопок на панелі
     */
    private ArrayList<IElement> buttons = new ArrayList<>();

    /**
     * Пустий конструктор
     */
    public Panel() {
    }

    /**
     * Добавляння одного обєкта кнопки в ліст
     *
     * @param button - кнопку, яку потрібно добавити в ліст
     */
    public void addButton(IElement button) {
        buttons.add(button);
    }

    /**
     * Добавляння ліста обєктів кнопок в ліст
     *
     * @param buttonsAdd - кнопки, які потрібно добавити в ліст
     */
    public void addButtons(ArrayList<IElement> buttonsAdd) {
        for (IElement element : buttonsAdd)
            addButton(element);
    }

    /**
     * Перевизначений метод прийняття відвідувача
     *
     * @param visitor - загальний відвідувач
     */
    @Override
    public void accept(IVisitor visitor) {
        for (IElement element : buttons)
            element.accept(visitor);
        visitor.visit(this);
    }
}
