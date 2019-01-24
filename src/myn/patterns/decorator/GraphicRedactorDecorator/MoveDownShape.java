package myn.patterns.decorator.GraphicRedactorDecorator;

public class MoveDownShape extends AbstractShapeRedactor {
    public AbstractShapeRedactor shapeClon;

    public MoveDownShape(AbstractShapeRedactor shape) {
        this.shapeClon = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shape.y = shape.y - 3;
        shape.draw(shape);
    }
}
