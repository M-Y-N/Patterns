/**
 * @author Senin Yuriy
 * @version 1.0
 * Клас Dot який реалізується від WarMachine
 */
public class Hummer implements WarMachine {
    protected int height = 0;
    protected int weigh = 0;

    /**
     * Конструктор Hummer з параметрами
     *
     * @param height висота h
     * @param weigh  довжина w
     */
    public Hummer(int height, int weigh) {
        this.height = height;
        this.weigh = weigh;
    }

    /**
     * Гетер для H
     *
     * @return повертає H
     */
    @Override
    public int getHeight() {
        return height;
    }


    /**
     * Метод для superSquare
     *
     * @return повертає square
     */
    @Override
    public int superSquare() {
        return weigh * height;
    }


    /**
     * Гетер для weight
     *
     * @return повертає weigh
     */
    @Override
    public int getWeight() {
        return weigh;
    }


    /**
     * Метод для findSquare
     *
     * @return вивід
     */
    @Override
    public void findSquare() {
        System.out.println("Hummer Square is: " + height * weigh + ". It height is " + height + " and it weight is " + weigh);

    }


}
