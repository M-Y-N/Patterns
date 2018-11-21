package myn.patterns.proxy.proxy.src.proxy;

/**
 * @author Tsaruk Vova
 * Клас ManipulateImage який реалізує інтерфейс IManipulateImage
 */

public class ManipulateImage implements IManipulateImage {
    public ManipulateImage(Color[][] colors) {
        this.colors = colors.clone();
    }

    private Color[][] colors ;

    public Color getIndex(int x,int y){
        return colors[x][y];
    }
    /**
     * Перевизначений метод знаходження кольору
     * @param x - x координата
     * @param y - y координата
     * @return колір по заданим координатам
     */
    @Override
    public Color findColor(int x, int y){
        System.out.println(String.format("Find color with parameters: X = %s, Y = %s", x, y));
        return  Color.Purple;
    }
}
