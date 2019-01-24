package myn.patterns.decorator.GraphicRedactorDecorator;

public class MoveUpShape extends AbstractShapeRedactor {
    AbstractShapeRedactor shapeClon;

    public MoveUpShape(AbstractShapeRedactor shape) {
        this.shapeClon = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shapeClon.x = shape.x;
        shapeClon.y = shape.y;
        shapeClon.size = shape.size;
        shapeClon.y = shapeClon.y + 10;
        shapeClon.draw(shapeClon);
    }
}
