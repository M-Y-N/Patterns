package myn.patterns.adapter.lab4;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Головний клас Main для запуску програми
 */
public class Main {
    public static void main(String[] args) {

        //IRectangle rectangleWithLines = new RectangleWithLines(2,2,5,5);
        //rectangleWithLines.draw();

        double[] arrayX = new double[100];
        double[] arrayY = new double[100];

        for (int i = 0; i < 100; i++) {
            arrayX[i] = i;
            arrayY[i] = i;
        }

        IHundredWithLines iHundredWithLines = new HundredWithLines(arrayX, arrayY);
        iHundredWithLines.draw();
    }
}
