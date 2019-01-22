package myn.patterns.proxy.proxy;

/**
 * @author Tsaruk Vova
 * Головний клас
 */
public class Main {

    public static void main(String[] args) {
        ManipulateImage manipulateImage = new ManipulateImage(new Color[][]{{Color.Purple, Color.Green,}, {Color.Blue, Color.Black,}, {Color.White, Color.Yellow}});
        ManipulateImageProxy proxy = new ManipulateImageProxy(manipulateImage);
        System.out.println("Using a proxy:");
        System.out.println(proxy.findColor(1, 1));

    }
}
