import java.util.ArrayList;
/**
 * @author Tsaruk Vova
 * Клас WorkstationElement який реалізує інтерфейс IElement
 */
public class WorkstationElement implements Element {
    /**
     * priceWorkstation ціна робочоъ станції
     */
    int priceWorkstation;
    /**
     * Ліст елементів робочої станції
     */
    private ArrayList<Element> elements = new ArrayList<>();
    /**
     * Конструктор який встановлює ціну робочої станції
     */
    public WorkstationElement(int priceWorkstation) {
        this.priceWorkstation = priceWorkstation;
    }
    /**
     * Добавляння одного обєкта  в ліст
     *
     * @param element - елемент, який потрібно добавити в ліст
     */
    public void addElement(Element element){
        elements.add(element);
    }
    /**
     * Добавляння ліста обєктів елементів в ліст
     *
     * @param elementsAdd - кнопки, які потрібно добавити в ліст
     */
    public void addElements(ArrayList<Element> elementsAdd){
        for(Element element : elementsAdd)
            addElement(element);
    }

    /**
     * Перевизначений метод прийняття відвідувача
     *
     * @param visitor - загальний відвідувач
     */
    @Override
    public void accept(Visitor visitor) {
        for(Element element : elements)
            element.accept(visitor);
        visitor.visit(this);
    }
}
