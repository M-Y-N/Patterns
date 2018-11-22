package myn.patterns.facade;


import myn.patterns.facade.file.Facade;

/**
 * @author Senin Yuriy
 */
public class Main {
    /**
     * @param args команда з командного рядка.
     */
    public static void main(String[] args) {

        Facade sub = new Facade();
        sub.create();
        sub.destroy();
    }
}
