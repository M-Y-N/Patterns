/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Головна функція для виклику методів
 */
public class Main {
    public static void main(String[] args) {
        BaseShape circle = new Circle(110, 110, 50, 100);
        BaseShape dot= new Dot(160, 160, 23, 24);
        BaseShape triangle = new Triangle(2,8,9,9);
        CompoundShape compoundShapeSimple = new CompoundShape(
                circle,
                dot,
                triangle
        );
        compoundShapeSimple.paint();
    }
}