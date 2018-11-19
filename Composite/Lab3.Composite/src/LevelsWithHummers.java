import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author Senin Yuriy
 * @version 1.0
 * Клас LevelsWithHummers який реалізується від WarMachine - контейнер для зберігання.
 */
public class LevelsWithHummers implements WarMachine {
    private List<WarMachine> warMachines = new ArrayList<>();

    private int index = 0;

    /**
     * Конструктор LevelsWithHummers з параметрами
     *
     * @param components обєкти для запису в контейнер
     */
    public LevelsWithHummers(WarMachine... components) {
        super();
        add(components);
    }

    /**
     * Додає обєкт в контейнер
     *
     * @param component обєкт для додання в контейнер
     */
    private void add(WarMachine component) {
        warMachines.add(component);
    }

    /**
     * Видаляє обєкти в контейнері
     *
     * @param machine обєкти для видаження в контейнері
     */
    public void remove(WarMachine machine) {
        int i = warMachines.indexOf(machine);
        warMachines.remove(i);
    }

    /**
     * Видаляє обєкти в контейнері
     *
     * @param components обєкти для видаження в контейнері
     */
    public void remove(WarMachine... components) {
        warMachines.removeAll(Arrays.asList(components));
    }

    /**
     * Додає обєкти в контейнер
     *
     * @param components обєкти для додання в контейнер
     */
    private void add(WarMachine... components) {
        warMachines.addAll(Arrays.asList(components));
    }

    /**
     * Вивід
     */
    @Override
    public void findSquare() {
        System.out.println();
        System.out.println("CompoundShape consist of this components :");
        for (WarMachine machines : warMachines) {
            machines.findSquare();
        }

        System.out.println("Level Square is: " + superSquare());
        System.out.println();
    }

    /**
     * Гетер H
     * @return повериає 0
     */
    @Override
    public int getHeight() {
        return 0;
    }
    /**
     * Гетер w
     * @return повериає 0
     */
    @Override
    public int getWeight() {
        return 0;
    }

    /**
     * Метод для обчислиння superSquare
     * @return повертає superSquare
     */
    @Override
    public int superSquare() {
        int superSquare = 0;
        for (WarMachine machines : warMachines
        ) {
            superSquare += machines.superSquare();
        }
        return superSquare;
    }


}


