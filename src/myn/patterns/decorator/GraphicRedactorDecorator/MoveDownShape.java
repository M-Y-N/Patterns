package myn.patterns.decorator.GraphicRedactorDecorator;

public class MoveDownShape extends AbstractShapeRedactor {
    AbstractShapeRedactor shape;

    public MoveDownShape(AbstractShapeRedactor shape) {
        this.shape = shape;
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        shape.y = shape.y - 3;
        shape.draw(shape);
    }
}
