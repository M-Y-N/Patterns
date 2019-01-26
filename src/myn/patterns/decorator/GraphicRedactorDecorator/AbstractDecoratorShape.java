package myn.patterns.decorator.GraphicRedactorDecorator;

public abstract class AbstractDecoratorShape implements Shape {


    /**
     * Next shape in the decorator chain
     */
    protected Shape next;

    public AbstractDecoratorShape(Shape next) {
        this.next = next;
    }
}
