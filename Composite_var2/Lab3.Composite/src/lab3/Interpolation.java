package lab3;

public class Interpolation {

    private double a;
    private double b;
    private double step;
    private int count;
    private double[] xNodes;
    private double[] yNodes;
    private double[] zNodes;

    public Interpolation(double a, double b, int count) {
        this.a = a;
        this.b = b;
        this.count = count;
        this.step = (b - a) / this.count;
        this.xNodes = new double[count + 1];
        this.yNodes = new double[count + 1];
        this.zNodes = new double[count + 1];
        for (int i = 0; i <= count; i++)
            this.xNodes[i] = this.a + i * this.step;
    }

    public void setY(String str) {
        if (str.equals("sin(x)")) {
            for (int i = 0; i <= count; i++) {
                yNodes[i] = Math.sin(xNodes[i]);
            }


        }

        if (str.equals("exp^-(x+sin(x))")) {
            for (int i = 0; i <= count; i++) {
                yNodes[i] = 1/Math.exp((xNodes[i])+Math.sin(xNodes[i]));
            }
        }
    }

    public double interp(String str, double xx) {
        double result = 0;
        if (str.equals("Лагранж")) {
            result = this.interpLagranj(xx);
        }

        if (str.equals("Ньютон")) {
            result = this.interpNewton(xx);
        }

        return result;
    }

    public double interpLagranj(double xx) {
        double result = 0;
        for (int i = 0; i <= count; i++) {
            double temp = 1;
            for (int j = 0; j < i; j++) {
                temp = temp * (xx - xNodes[j]) / (xNodes[i] - xNodes[j]);
            }
            for (int j = i + 1; j <= count; j++) {
                temp = temp * (xx - xNodes[j]) / (xNodes[i] - xNodes[j]);
            }

            result = result + temp * yNodes[i];

        }

        return result;
    }

    public double interpNewton(double xx) {

        double result = yNodes[0];
        double buf = 1;
        for (int k = 1; k <= count; k++) {
            double tempSum = 0;
            for (int i = 0; i <= k; i++) {
                double temp = 1;
                for (int j = 0; j < i; j++)
                    temp = temp * (xNodes[i] - xNodes[j]);
                for (int j = i + 1; j <= k; j++)
                    temp = temp * (xNodes[i] - xNodes[j]);
                temp = yNodes[i] / temp;
                tempSum += temp;
            }
            buf = buf * (xx - xNodes[k - 1]);
            result = result + tempSum * buf;
        }

        return result;
    }

    public double getX(int i) {
        return xNodes[i];
    }

    public double getY(int i) {
        return yNodes[i];
    }


    public double getError(String strFun, String strInt, double xx) {
        Interpolation interp1 = new Interpolation(a, b, count + 1);
        interp1.setY(strFun);
        return (interp1.interp(strInt, xx) - this.interp(strInt, xx));
    }

    public double getErrorOfError(String strFun, String strInt, double xx) {
        Interpolation interp1 = new Interpolation(a, b, count + 1);
        interp1.setY(strFun);
        return interp1.getError(strFun, strInt, xx);
    }

    public double getBluriness(String strFun, String strInt, double xx) {
        return getErrorOfError(strFun, strInt, xx) / getError(strFun, strInt, xx);
    }
}