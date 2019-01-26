package myn.patterns.decorator.text_decorator;
/**
 * @author Zaichenko Vasyl
 * Abstract class for printing text by different variant of typing
 */
public abstract class AbstractPrintDecorator implements Print {
    /**
     * object other printer for combination different variant of typing
     */
    protected Print printer;

    /**
     * Constructor abstract printer
     *
     * @param printer next object other printer for next variant of typing
     */
    public AbstractPrintDecorator(Print printer) {
        this.printer = printer;
    }

    /**
     * Typing text by different ways in the editor
     *
     * @param text
     * @return the operation
     */
    @Override
    public abstract String print(String text);
}
