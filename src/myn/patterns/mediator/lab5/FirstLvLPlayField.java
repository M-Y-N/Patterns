package myn.patterns.mediator.lab5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sienin Yuriy
 * @version 1.0
 * Медіатор який реалізує інтерфейс PlayField
 */
public class FirstLvLPlayField implements PlayField {
    /**
     * Ліст червоних кліток
     */
    List<Cell> cellsRedList = new ArrayList<>();
    /**
     * Ліст зелених кліток
     */
    List<Cell> cellsGreenList = new ArrayList<>();

    /**
     * Добалення кліток
     */
    public void addCell(Cell cell) {
        if (cell instanceof GreenCell) {
            cellsGreenList.add(cell);
        } else {
            cellsRedList.add(cell);
        }
    }


    /**
     * Зміна кліток
     */
    @Override
    public void changeActive(boolean changeActive, Cell cell) {
        if (cell instanceof GreenCell) {
            for (Cell greenCell : cellsGreenList) {
                greenCell.controleActive(changeActive);
            }
        } else {
            for (Cell redCell : cellsRedList) {
                redCell.controleActive(changeActive);
            }
        }
    }

    public void print() {
        for (int i = 0; i < cellsGreenList.size(); i++) {
            cellsGreenList.get(i).print();
        }
        for (int i = 0; i < cellsRedList.size(); i++) {
            cellsRedList.get(i).print();
        }
        System.out.println();
    }


}


