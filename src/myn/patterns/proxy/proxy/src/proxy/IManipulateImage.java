package myn.patterns.proxy.proxy.src.proxy;
/**
 * @author Tsaruk Vova
 * Інтерфейс для маніпулювання зображеннями
 */
public interface IManipulateImage {
    /**
     * Метод знаходження кольору
     * @param x - x координата
     * @param y - y координата
     * @return колір по заданим координатам
     */
    Color findColor(int x, int y);
}
