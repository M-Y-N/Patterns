package myn.patterns.decorator.GraphicRedactorDecorator;

public class MoveUpShape extends AbstractShapeRedactor {
    AbstractShapeRedactor shapeClon;

    public MoveUpShape(AbstractShapeRedactor shape) {
        this.shapeClon = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shape.y = shape.y + 10;
        shape.draw(shape);
    }
}
