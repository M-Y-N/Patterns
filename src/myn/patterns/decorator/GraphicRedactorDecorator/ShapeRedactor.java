package myn.patterns.decorator.GraphicRedactorDecorator;

public class ShapeRedactor implements IShapeRedactor {


    @Override
    public void draw(IShapeRedactor shape) {
        System.out.println("Draw shape with coordinate x = " + x + " y = " + y + " size = " + size);
    }

    public int x;
    public int y;
    public int size;

    public ShapeRedactor() {
        x = 0;
        y = 0;
        size =0;
    }

    public ShapeRedactor(int x, int y,int size) {

        this.x = x;
        this.y = y;
        this.size=size;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
