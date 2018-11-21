package myn.patterns.Mediator.lab5;
/**
 * Абстрактний класс Cell для медіатора
 */
abstract class Cell {
    PlayField playField;
    String name;
    boolean isActive= true;
    /**
     * Конструктор на заповнення певних кліток
     */
    public Cell(PlayField playField, String name) {
        this.playField = playField;
        this.name = name;
    }
    /**
     * Наявність минулого елементу
     *
     * @return повертає ім'я елемента
     */
    public String getName() {
        return name;
    }
    /**
     * Показую активність клітки
     */
    public void changeActive(boolean isActive) {
        playField.changeActive(isActive, this);
    }

    abstract void controleActive(boolean isActive);

    abstract void print();


    @Override
    public String toString() {
        return "Cell [name=" + name + "]";
    }
}