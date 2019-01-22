package myn.patterns.mediator.lab5;

/**
 * Класс який наслідує абстрактний класс Cell
 */
class GreenCell extends Cell {
    /**
     * Конструктор на заповнення зелених кліток
     */
    public GreenCell(PlayField playField, String name) {
        super(playField, name);
    }


    /**
     * Перевіряє на активність червоної клітки
     */
    @Override
    void controleActive(boolean isActive) {
        if (this.isActive != isActive)
            this.isActive = isActive;
        System.out.println("Green Cell " + getName() + " . Active is - " + isActive);
    }


    /**
     * Вивід на екран
     */
    @Override
    public void print() {
        System.out.println("Green Cell" + getName() + " . Active is - " + isActive);
    }
}
