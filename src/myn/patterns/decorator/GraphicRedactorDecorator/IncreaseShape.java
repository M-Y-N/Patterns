package myn.patterns.decorator.GraphicRedactorDecorator;

public class IncreaseShape extends ShapeRedactor {
    AbstractShapeRedactor shape;

    public IncreaseShape(AbstractShapeRedactor shape) {
        this.shape = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shape.size = shape.size * 5;
        shape.draw(shape);
    }
}
