package myn.patterns.observer.dbtrigger;
/**
 * @author Zaichenko Vasyl
 * Клас підписник AfterTrigger який реалізує інтерфейс Trigger
 */
public class AfterTriggerInsert implements Trigger {
    private int triggerValue;
    /**
     * Назва триггера
     */
    private String nameTrigger;

    /**
     * Конструктор AfterTrigger
     *
     * @param nameTrigger - назва триггера
     */

    public AfterTriggerInsert(int triggerValue, String nameTrigger) {
        this.triggerValue = triggerValue;
        this.nameTrigger = nameTrigger;
    }

    /**
     * Метод реагування підписника
     */
    @Override
    public void handleEvent(int value) throws Exception {
        if(value >=0 && value<= triggerValue)
            System.out.println("Insert Trigger "+nameTrigger+" After: value correct");
        else throw new Exception("Value Incorrect");
    }
}