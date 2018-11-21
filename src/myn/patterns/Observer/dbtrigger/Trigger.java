package myn.patterns.observer.dbtrigger;

/**
 * @author Zaichenko Vasyl
 * Інтерфейс підписника
 */
public interface Trigger {
    /**
     * Метод реагування підписника
     */
    void handleEvent(int value) throws Exception;
}
