import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Panel panel = new Panel();
        ArrayList<Element> buttons = new ArrayList<>();
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
