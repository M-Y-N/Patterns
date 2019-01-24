package myn.patterns.decorator.text_decorator;

public class TextPrint extends Print {

    public TextPrint(String text) {
        super.text = text;
    }

    @Override
    public String print() {
        return text;
    }
}
