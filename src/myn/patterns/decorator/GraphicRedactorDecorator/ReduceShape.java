package myn.patterns.decorator.GraphicRedactorDecorator;

public class ReduceShape extends AbstractShapeRedactor{
    AbstractShapeRedactor shapeClon;

    public ReduceShape(AbstractShapeRedactor shape) {
        this.shapeClon = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shapeClon.x = shape.x;
        shapeClon.y = shape.y;
        shapeClon.size = shape.size;
        shapeClon.size = shapeClon.size / 2;
        shapeClon.draw(shapeClon);
    }
}
