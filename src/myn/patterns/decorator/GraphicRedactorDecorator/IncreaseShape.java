package myn.patterns.decorator.GraphicRedactorDecorator;

public class IncreaseShape extends AbstractShapeRedactor {
    AbstractShapeRedactor shapeClon;

    public IncreaseShape(AbstractShapeRedactor shape) {
        this.shapeClon = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shapeClon.x = shape.x;
        shapeClon.y = shape.y;
        shapeClon.size = shape.size;
        shapeClon.size = shapeClon.size * 5;
        shapeClon.draw(shapeClon);
    }
}
