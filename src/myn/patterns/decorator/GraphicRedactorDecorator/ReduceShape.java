package myn.patterns.decorator.GraphicRedactorDecorator;

public class ReduceShape extends AbstractShapeRedactor{
    AbstractShapeRedactor shapeClon;

    public ReduceShape(AbstractShapeRedactor shape) {
        this.shapeClon = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shape.size = shape.size / 2;
        shape.draw(shape);
    }
}
