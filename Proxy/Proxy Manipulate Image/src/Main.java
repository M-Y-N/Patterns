/**
 * @author Zaichenko Vasyl
 * Головний клас, яка реалізую лабораторну роботу №3
 */
public class Main {

    public static void main(String[] args){
        ManipulateImage manipulateImage = new ManipulateImage();
	    Proxy proxy = new Proxy(manipulateImage);

        System.out.println("\nWihtout proxy:");
        System.out.println(manipulateImage.findColor(2,5));

        System.out.println("Wiht proxy:");
        System.out.println(proxy.findColor(3,6));
    }
}