package myn.patterns.decorator.text_decorator;

public abstract class AbstractPrintDecorator implements Print {
    /**
     * object other printer for combination different variant of typing
     */
    protected Print printer;

    /**
     * Constructor of lower register printer
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
