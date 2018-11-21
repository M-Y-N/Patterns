package myn.patterns.Visitor.Lab6 /**
 * @author Zaichenko Vasyl
 * Головний клас, яка реалізую лабораторну роботу №6
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Panel panel = new Panel();
        ArrayList<IElement> buttons = new ArrayList<>();
        buttons.add(new BasicButton());
        buttons.add(new BasicButton());
        buttons.add(new BasicButton());
        buttons.add(new BigButton());
        buttons.add(new BigButton());
        buttons.add(new GoldButton());
        panel.addButtons(buttons);

        CounterVisitor counterVisitor = new CounterVisitor();
        panel.accept(counterVisitor);
        System.out.println(counterVisitor.toString());
    }
}
