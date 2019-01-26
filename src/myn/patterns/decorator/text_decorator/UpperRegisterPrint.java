package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Decorator class for printing text by upper register way
 */
public class UpperRegisterPrint extends Print {
    /**
     * object other printer for combination different variant of typing
     */
    private Print printer;

    /**
     * Constructor of upper register printer
     *
     * @param printer next object other printer for next variant of typing
     */
    public UpperRegisterPrint(Print printer) {
        this.printer = printer;
    }

    /**
     * Typing upper register text in the editor
     *
     * @return the operation
     */
    @Override
    public String print() {
        return printer.print().toUpperCase();
    }
}
