package proxy;

/**
 * @author Tsaruk Vova
 * Прокси-клас Proxy для класу ManipulateImage
 */

public class ManipulateImageProxy implements IManipulateImage {
    private ManipulateImage largeImage = null;
    private Color[][] cache = new Color[2][3];



    public ManipulateImageProxy(ManipulateImage manipulateImage) {
        largeImage = manipulateImage;
    }


    /**
     * Перевизначений метод знаходження кольору
     * @param x - x координата
     * @param y - y координата
     * @return колір по заданим координатам
     */
    @Override
    public Color findColor(int x, int y) {

        if ( cache[x][y] != null) {
            return cache[x][y];
        }
        cache[x][y] = largeImage.getIndex(x, y);
        return cache[x][y];
    }
}
