package myn.patterns.composite.lab3_1;

/**
 * @author Yuriy Senin
 * @version 1.0
 * Клас MedicalHummer який наслідується від Hummer
 */
public class MedicalHummer extends  Hummer {
    /**
     * Конструктор MedicalHummer з параметрами
     * @param height - висота
     * @param weigh  - ширина
     */
    public MedicalHummer(int height, int weigh) {
        super(height, weigh);
    }

    /**
     * Вивід на екран
     */
    @Override
    public void findSquare() {
        System.out.println("Medical hummer Square is: " + height * weigh + ". It height is " + height + " and it weight is " + weigh);

    }
}
