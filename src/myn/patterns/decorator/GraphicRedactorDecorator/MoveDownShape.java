package myn.patterns.decorator.GraphicRedactorDecorator;

public class MoveDownShape extends AbstractShapeRedactor {
    public AbstractShapeRedactor shapeClon;

    public MoveDownShape(AbstractShapeRedactor shape) {
        this.shapeClon = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shapeClon.x = shape.x;
        shapeClon.y = shape.y;
        shapeClon.size = shape.size;
        shapeClon.y = shapeClon.y - 3;
        shapeClon.draw(shapeClon);
    }
}
