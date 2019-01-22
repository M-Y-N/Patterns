package myn.patterns.mediator.lab5;

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


    /**
     * Перевіряє на активність червоної клітки
     */
    @Override
    void controleActive(boolean isActive) {
        if (this.isActive != isActive)
            this.isActive = isActive;
        System.out.println("Red Cell" + getName() + " . Active is - " + isActive);
    }


    /**
     * Вивід на екран
     */
    @Override
    public void print() {
        System.out.println("Red Cell" + getName() + " . Active is - " + isActive);
    }
}
