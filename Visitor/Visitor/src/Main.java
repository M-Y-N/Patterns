import java.util.ArrayList;
/**
 * @author Tsaruk Vova
 * Головний клас, яка реалізую лабораторну роботу №6
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Element>goods=new ArrayList<>();
        WorkstationElement workstation = new WorkstationElement(5000);

        Element cable1 = new CableElement(400);
        Element cable2 = new CableElement(300);
        Element cable3 = new CableElement(200);

        Element server1 = new ServerElement(1500);
        Element server2 = new ServerElement(2300);

        goods.add(cable1);
        goods.add(cable2);
        goods.add(cable3);
        goods.add(server1);
        goods.add(server2);

        workstation.addElements(goods);
         Visitor visitor=new PriceVisitor();
         workstation.accept(visitor);
        System.out.println(visitor.toString());
    }
}
