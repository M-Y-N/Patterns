package myn.patterns.composite.lab3_1;

/**
 * @author Senin Yuriy
 * @version 1.0
 * Клас MilitaryHummer який наслідується від Hummer
 */
public class MilitaryHummer extends  Hummer {
    /**
     * Конструктор MilitaryHummer з параметрами
     * @param height - висота
     * @param weigh  - ширина
     */
    public MilitaryHummer(int height, int weigh) {
        super(height, weigh);
    }

    /**
     * Вивід на екран
     */
    @Override
    public void findSquare() {
        System.out.println("Military hummer Square is: " + height * weigh + ". It height is " + height + " and it weight is " + weigh);

    }
}
