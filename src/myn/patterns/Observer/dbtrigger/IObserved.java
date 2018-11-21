package myn.patterns.Observer.dbtrigger;

/**
 * @author Zaichenko Vasyl
 * Інтерфейс видавця
 */
public interface IObserved {
    /**
     * Метод добавляння підписника
     */
    void addObserver(Trigger observer);

    /**
     * Метод видалення підписника
     */
    void removeObserver(Trigger observer);

    /**
     * Метод сповіщення підписки для AfterTrigger
     */
    void notifyAfterObserverInsert() throws Exception;

    /**
     * Метод сповіщення підписки для BeforeTrigger
     */
    void notifyBeforeObserverInsert() throws Exception;

    /**
     * Метод сповіщення підписки для AfterTrigger
     */
    void notifyAfterObserverUpdate() throws Exception;

    /**
     * Метод сповіщення підписки для BeforeTrigger
     */
    void notifyBeforeObserverUpdate() throws Exception;
}
