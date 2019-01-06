package myn.patterns.memento;
/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Головний клас Main для запуску програми
 */
public class Main {

    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(1, 2, Color.Red, 3, 4);
        Square square = new Square(3, 4, Color.Green, 5);
        Triangle triangle = new Triangle(6, 7, Color.Blue, 6, 7, 8);

        VectorRedactor vectorRedactor = new VectorRedactor(Color.White, true);
        vectorRedactor.add(rectangle);
        vectorRedactor.add(square);
        vectorRedactor.add(triangle);

        HistoryPreviousStatus history = new HistoryPreviousStatus();
        vectorRedactor.save(history);

        vectorRedactor.print();

        Triangle triangle2 = new Triangle(60, 7, Color.Blue, 6, 7, 8);
        vectorRedactor.add(triangle2);

        rectangle.setFields(100, 100, Color.Black, 100, 100);
        square.setFields(100, 100, Color.Black, 100);
        triangle.setFields(100, 100, Color.Black, 100, 100, 100);

        vectorRedactor.setBackgroundVectorRedactor(Color.Blue);
        vectorRedactor.setFullScreen(false);

        vectorRedactor.print();

        vectorRedactor.load(history);
        vectorRedactor.print();
    }
}