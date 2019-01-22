package myn.patterns.adapter.lab4;

public class HundredWithLines extends Line implements IHundredWithLines {
    private double[] arrayX;
    private double[] arrayY;
    private double widthMonitor = 200;


    public HundredWithLines(double[] arrayX, double[] arrayY) {
        this.arrayX = arrayX.clone();
        this.arrayY = arrayY.clone();
    }

    /**
     * Вивід на екран прямокутника
     */
    @Override
    public void draw() {
        String coordinate = "second";
        double[] arrayXsecondCoordinate = new double[arrayX.length];
        double[] arrayYsecondCoordinate = new double[arrayY.length];
        for (int i = 0; i < arrayX.length; i++) {
            arrayXsecondCoordinate[i] = this.arrayX[i] - widthMonitor / 2;
            arrayYsecondCoordinate[i] = -this.arrayY[i];
        }

        System.out.println("HundredCorn consist of : ");
        for (int i = 0; i < arrayX.length; i += 2) {
            draw(arrayXsecondCoordinate[i], arrayYsecondCoordinate[i], arrayXsecondCoordinate[i + 1],
                arrayYsecondCoordinate[i], coordinate);
            draw(arrayXsecondCoordinate[i + 1], arrayYsecondCoordinate[i], arrayXsecondCoordinate[i + 1],
                arrayYsecondCoordinate[i + 1], coordinate);
        }
    }
}
