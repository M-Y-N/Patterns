package myn.patterns.proxy.image_manitulation;

/**
 * @author Zaichenko Vasyl
 * Інтерфейс для маніпулювання зображеннями
 */
public interface IManipulateImage {
    /**
     * Метод знаходження кольору
     *
     * @param x - x координата
     * @param y - y координата
     * @return колір по заданим координатам
     */
    Color findColor(double x, double y) throws Exception;
}
