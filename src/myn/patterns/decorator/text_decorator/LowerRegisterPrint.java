package myn.patterns.decorator.text_decorator;

/**
 * @author Zaichenko Vasyl
 * Decorator class for printing text by lower register way
 */
public class LowerRegisterPrint extends Print {
    /**
     * object other printer for combination different variant of typing
     */
    private Print printer;

    /**
     * Constructor of lower register printer
     *
     * @param printer next object other printer for next variant of typing
     */
    public LowerRegisterPrint(Print printer) {
        this.printer = printer;
    }

    /**
     * Typing lower register text in the editor
     *
     * @return the operation
     */
    @Override
    public String print() {
        return printer.print().toLowerCase();
    }
}
