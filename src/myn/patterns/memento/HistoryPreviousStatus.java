package myn.patterns.memento;

import java.util.Stack;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас HistoryPreviousStatus  містить історію зберігань
 */
public class HistoryPreviousStatus {
    /**
     * Масив збережених даних
     */
    private Stack<IStatusRedactor> previousStatuses;

    /**
     * Пустий конструктор
     */
    HistoryPreviousStatus() {
        previousStatuses = new Stack<>();
    }

    /**
     * Повертає збережені дані
     *
     * @param vectorRedactor об'єкт отримувач
     */
    public void getPreviousStatus(VectorRedactor vectorRedactor) {
        vectorRedactor.load(previousStatuses.pop());
    }

    /**
     * Метод для зберігання даних в історію
     *
     * @param previousStatus дані для зберігання
     */
    public void setPreviousStatus(IStatusRedactor previousStatus) {
        previousStatuses.push(previousStatus);
    }
}
