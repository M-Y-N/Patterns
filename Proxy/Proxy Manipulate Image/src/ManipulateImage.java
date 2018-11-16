/**
 * @author Zaichenko Vasyl
 * Клас ManipulateImage який реалізує інтерфейс IManipulateImage
 */
public class ManipulateImage implements IManipulateImage {

    /**
     * Конструктор класу ManipulateImage

     */
    public ManipulateImage() {
    }

    /**
     * Перевизначений метод знаходження кольору
     * @param x - x координата
     * @param y - y координата
     * @return колір по заданим координатам
     */
    @Override
    public Color findColor(double x, double y) {
        System.out.println(String.format("Find color with parameters: X = %s, Y = %s\n" +
                "Method findColor in class ManipulateImage", x, y));
        return  Color.Black;
    }
}
