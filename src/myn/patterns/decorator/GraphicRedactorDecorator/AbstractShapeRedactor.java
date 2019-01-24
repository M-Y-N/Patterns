package myn.patterns.decorator.GraphicRedactorDecorator;

public abstract class AbstractShapeRedactor {
    public int x;
    public int y;
    public int size;

    public AbstractShapeRedactor() {
        x = 0;
        y = 0;
        size =0;
    }

    public AbstractShapeRedactor(int x, int y,int size) {

        this.x = x;
        this.y = y;
        this.size=size;
    }

    public abstract void draw(AbstractShapeRedactor shape);

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
