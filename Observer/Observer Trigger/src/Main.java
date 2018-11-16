/**
 * @author Zaichenko Vasyl
 * Головний клас, яка реалізую лабораторну роботу №5
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ManagementSystem systemDB = new ManagementSystem();

        AfterTriggerInsert afterTrigger1ins = new AfterTriggerInsert(600,"AfterTrigger1");
        BeforeTriggerInsert beforeTrigger1ins = new BeforeTriggerInsert(700,"BeforeTrigger1");
        AfterTriggerUpdate afterTrigger2upt = new AfterTriggerUpdate(100,"AfterTrigger2");
        BeforeTriggerUpdate beforeTrigger2upt = new BeforeTriggerUpdate(150,"BeforeTrigger2");
        systemDB.addObserver(afterTrigger1ins);
        systemDB.addObserver(beforeTrigger1ins);
        systemDB.addObserver(afterTrigger2upt);
        systemDB.addObserver(beforeTrigger2upt);

        systemDB.Insert(5);
        systemDB.Update(4);
    }
}
