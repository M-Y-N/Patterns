package myn.patterns.decorator.GraphicRedactorDecorator;

public class Main {
    public static void main(String[] args) {
        AbstractShapeRedactor shape = new MoveDownShape(new MoveUpShape(new ReduceShape(new IncreaseShape(new ShapeRedactor(3,3,10)))));
        shape.draw(shape);
    }
}
