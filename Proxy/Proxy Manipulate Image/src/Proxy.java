/**
 * @author Zaichenko Vasyl
 * Прокси-клас Proxy для класу ManipulateImage
 */
public class Proxy implements IManipulateImage {
    private ManipulateImage manipulateImage;

    /**
     * Конструктор класу Proxy
     */
    public Proxy(ManipulateImage manipulateImage) {
        this.manipulateImage = manipulateImage;
    }

    /**
     * Перевизначений метод знаходження кольору
     * @param x - x координата
     * @param y - y координата
     * @return колір по заданим координатам
     */
    @Override
    public Color findColor(double x, double y)  {
        System.out.println("Transparent hashing");
        return manipulateImage.findColor(x, y);
    }
}
