/**
 * @author Zaichenko Vasyl
 * Клас підписник AfterTrigger який реалізує інтерфейс Trigger
 */
public class AfterTriggerUpdate implements Trigger {
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

    public AfterTriggerUpdate(int triggerValue, String nameTrigger) {
        this.triggerValue = triggerValue;
        this.nameTrigger = nameTrigger;
    }

    /**
     * Метод реагування підписника
     */
    @Override
    public void handleEvent(int value) throws Exception {
        if(value >=0 && value<= triggerValue)
            System.out.println("Update Trigger "+nameTrigger+" After: value correct");
        else throw new Exception("Value Incorrect");
    }
}