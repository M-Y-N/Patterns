package myn.patterns.decorator.GraphicRedactorDecorator;

public class ReduceShape implements IShapeRedactor{
    IShapeRedactor shape;

    public ReduceShape(IShapeRedactor shape) {
        this.shape = shape;
    }

    @Override
    public void draw(IShapeRedactor shape) {
        shape.size = shape.size / 2;
        shape.draw(shape);
    }
}
