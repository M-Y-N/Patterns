import java.util.ArrayList;

public class Panel implements Element{
    private ArrayList<Element> buttons = new ArrayList<>();

    public Panel() { }

    public void addButton(Element button){
        buttons.add(button);
    }

    public void addButtons(ArrayList<Element> buttonsAdd){
        for(Element element : buttonsAdd)
            addButton(element);
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element element : buttons)
            element.accept(visitor);
        visitor.visit(this);
    }
}
