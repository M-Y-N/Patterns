package com.company;

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

    @Override
    /**
     * Перевіряє на активність червоної клітки
     */
    void controleActive(boolean isActive) {
        if (this.isActive != isActive)
            this.isActive = isActive;
        System.out.println("Green Cell " + getName() + " . Active is - " + isActive);
    }
    @Override
    /**
     * Вивід на екран
     */
    public void print() {
        System.out.println("Green Cell" + getName() + " . Active is - " + isActive);
    }
}