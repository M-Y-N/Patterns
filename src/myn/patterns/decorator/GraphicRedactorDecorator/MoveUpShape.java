package myn.patterns.decorator.GraphicRedactorDecorator;

public class MoveUpShape extends AbstractShapeRedactor {
    AbstractShapeRedactor shape;

    public MoveUpShape(AbstractShapeRedactor shape) {
        this.shape = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shape.y = shape.y + 10;
        shape.draw(shape);
    }
}
