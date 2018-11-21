package myn.patterns.mediator.lab5;;

/**
 * Класс який наслідує абстрактний класс Cell
 */
class RedCell extends Cell {
    /**
     * Конструктор, який задає параметри клітці
     */
    public RedCell(PlayField playField, String name) {
        super(playField, name);
    }

    @Override
    /**
     * Перевіряє на активність червоної клітки
     */
    void controleActive(boolean isActive) {
        if (this.isActive != isActive)
            this.isActive = isActive;
        System.out.println("Red Cell" + getName() + " . Active is - " + isActive);
    }
    @Override
    /**
     * Вивід на екран
     */
    public void print() {
        System.out.println("Red Cell" + getName() + " . Active is - " + isActive);
    }
}