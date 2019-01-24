package myn.patterns.decorator.GraphicRedactorDecorator;

public class ShapeRedactor extends AbstractShapeRedactor {

    public ShapeRedactor() {
    }

    public ShapeRedactor(int x, int y, int size) {
        super(x, y, size);
    }

    @Override
    public void draw(AbstractShapeRedactor shape) {
        System.out.println("Draw shape with coordinate x = " + x + " y = " + y + " size = " + size);
    }

}
