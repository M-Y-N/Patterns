package myn.patterns.decorator.GraphicRedactorDecorator;

public class Main {
    public static void main(String[] args) {
        AbstractShapeRedactor shapeRedactor = new ShapeRedactor(3,3,10);
        AbstractShapeRedactor shape = new MoveDownShape(new MoveUpShape(new ReduceShape(new IncreaseShape(shapeRedactor))));
        shape.draw(shapeRedactor);
    }
}
