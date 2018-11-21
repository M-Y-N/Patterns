package myn.patterns.Observer.dbtrigger;

import java.util.ArrayList;

/**
 * @author Zaichenko Vasyl
 * Клас видавець ManagementSystemDB який реалізує інтерфейс IObserved
 */
public class ManagementSystem implements IObserved {
    public int value;
    /**
     * Список підписників для AfterTrigger
     */
    private ArrayList<Trigger> afterTriggerInsert = new ArrayList<>();
    /**
     * Список підписників для BeforeTrigger
     */
    private ArrayList<Trigger> beforeTriggerInsert = new ArrayList<>();
    /**
     * Список підписників для AfterTrigger
     */
    private ArrayList<Trigger> afterTriggerUpdate = new ArrayList<>();
    /**
     * Список підписників для BeforeTrigger
     */
    private ArrayList<Trigger> beforeTriggerUpdate = new ArrayList<>();

    /**
     * Пустий конструктор
     */
    public ManagementSystem() {
    }

    /**
     * Метод добавляння підписника
     *
     * @param observer - підписник
     */
    @Override
    public void addObserver(Trigger observer) {
        if (observer instanceof AfterTriggerInsert)
            afterTriggerInsert.add(observer);
        if (observer instanceof BeforeTriggerInsert)
            beforeTriggerInsert.add(observer);
        if (observer instanceof AfterTriggerUpdate)
            afterTriggerUpdate.add(observer);
        if (observer instanceof BeforeTriggerUpdate)
            beforeTriggerUpdate.add(observer);
    }

    /**
     * Метод видалення підписника
     *
     * @param observer - підписник
     */

    @Override
    public void removeObserver(Trigger observer) {
        if (observer instanceof AfterTriggerInsert)
            afterTriggerInsert.remove(observer);
        if (observer instanceof BeforeTriggerInsert)
            beforeTriggerInsert.remove(observer);
        if (observer instanceof AfterTriggerUpdate)
            afterTriggerUpdate.remove(observer);
        if (observer instanceof BeforeTriggerUpdate)
            beforeTriggerUpdate.remove(observer);
    }

    /**
     * Метод сповіщення підписки для AfterTrigger
     */
    @Override
    public void notifyAfterObserverInsert() throws Exception {
        for (Trigger element : afterTriggerInsert) {
            element.handleEvent(value);
        }
    }

    /**
     * Метод сповіщення підписки для BeforeTrigger
     */
    @Override
    public void notifyBeforeObserverInsert() throws Exception {
        for (Trigger element : beforeTriggerInsert) {
            element.handleEvent(value);
        }
    }
    @Override
    public void notifyAfterObserverUpdate() throws Exception {
        for (Trigger element : afterTriggerUpdate) {
            element.handleEvent(value);
        }
    }

    /**
     * Метод сповіщення підписки для BeforeTrigger
     */
    @Override
    public void notifyBeforeObserverUpdate() throws Exception {
        for (Trigger element : beforeTriggerUpdate) {
            element.handleEvent(value);
        }
    }

    /**
     * Заглушений метод Insert
     */
    public void Insert(int valueCurr) throws Exception {
        notifyBeforeObserverInsert();
        value = valueCurr;
        System.out.println("Method INSERT, value = "+ valueCurr);
        notifyAfterObserverInsert();
        System.out.println();
    }

//    /**
//     * Заглушений метод Delete
//     */
//    public void Delete() throws Exception {
//        notifyBeforeObserver();
//        value = 0;
//        System.out.println("Method INSERT, value = 0");
//        notifyAfterObserver();
//        System.out.println();
//    }
//
    /**
     * Заглушений метод Update
     */
    public void Update(int valueCurr) throws Exception {
        notifyBeforeObserverUpdate();
        value+=valueCurr;
        System.out.println("Method UPDATE, value = "+value);
        notifyAfterObserverUpdate();
        System.out.println();
    }
}
