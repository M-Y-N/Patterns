package myn.patterns.decorator.GraphicRedactorDecorator;

public class IncreaseShape extends AbstractShapeRedactor {
    AbstractShapeRedactor shapeClon;

    public IncreaseShape(AbstractShapeRedactor shape) {
        this.shapeClon = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shape.size = shape.size * 5;
        shape.draw(shape);
    }
}
