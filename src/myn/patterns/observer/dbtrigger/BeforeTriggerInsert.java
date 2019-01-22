package myn.patterns.observer.dbtrigger;

/**
 * @author Zaichenko Vasyl
 * Клас підписник BeforeTrigger який реалізує інтерфейс Trigger
 */
public class BeforeTriggerInsert implements Trigger {
    private int triggerValue;
    /**
     * Назва триггера
     */
    private String nameTrigger;

    /**
     * Конструктор BeforeTrigger
     *
     * @param nameTrigger - назва триггера
     */
    public BeforeTriggerInsert(int triggerValue, String nameTrigger) {
        this.triggerValue = triggerValue;
        this.nameTrigger = nameTrigger;
    }

    /**
     * Метод реагування підписника
     */
    @Override
    public void handleEvent(int value) throws Exception {
        if (value >= 0 && value <= triggerValue)
            System.out.println("Insert Trigger " + nameTrigger + " Before: value correct for triggerValue - " + triggerValue);
        else throw new Exception("Value Incorrect");
    }
}
