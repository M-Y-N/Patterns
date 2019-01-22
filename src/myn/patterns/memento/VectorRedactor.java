package myn.patterns.memento;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас VectorRedactor як об'єкт для зберігання
 */
public class VectorRedactor {
    /**
     * Поточні дані редактора
     */
    private StatusRedactor statusRedactor;

    /**
     * Конструктор редактора
     *
     * @param backgroundVectorRedactor задній колір
     * @param fullScreen               повний екран
     */
    public VectorRedactor(Color backgroundVectorRedactor, boolean fullScreen) {
        statusRedactor = new StatusRedactor(backgroundVectorRedactor, fullScreen);
        statusRedactor.baseShapes = new ArrayList<>();
    }

    /**
     * Метод для додавання фігур в масив
     *
     * @param baseShape фігура
     */
    public void add(BaseShape baseShape) {
        statusRedactor.baseShapes.add(baseShape);
    }

    /**
     * Вивід всіх фігур
     */
    public void print() {
        System.out.println(statusRedactor);
        for (BaseShape element : statusRedactor.baseShapes) {
            System.out.println(element);
        }
        System.out.println();
    }

    /**
     * Зберігає дані
     *
     * @param history архів зберігань
     */

    public void save(HistoryPreviousStatus history) {
        history.setPreviousStatus(statusRedactor.clone());
    }

    /**
     * Метод для зберігання даних в історію
     *
     * @param previousStatus дані для зберігання
     */
    public void load(IStatusRedactor previousStatus) {
        if (!(previousStatus instanceof StatusRedactor))
            throw new ClassCastException();
        this.statusRedactor = (StatusRedactor) previousStatus;
    }

    /**
     * Метод для зберігання даних в історії
     */
    public void load(HistoryPreviousStatus history) {
        history.getPreviousStatus(this);
    }


    /**
     * Метод для зберігання даних в історію
     *
     * @param backgroundVectorRedactor задній коліп
     */
    public void setBackgroundVectorRedactor(Color backgroundVectorRedactor) {
        statusRedactor.backgroundVectorRedactor = backgroundVectorRedactor;
    }

    /**
     * Метод для зберігання даних в історію
     *
     * @param fullScreen повний екран
     */
    public void setFullScreen(boolean fullScreen) {
        statusRedactor.fullScreen = fullScreen;
    }


    /**
     * @author Ivan Zaichenko
     * @version 1.0
     * Клас StatusRedactor створює копію об'єкту
     */
    private class StatusRedactor implements IStatusRedactor {
        /**
         * Масив фігур копії
         */
        private ArrayList<BaseShape> baseShapes;
        /**
         * Ім'я копії
         */
        final String dateSave;
        /**
         * Задній колір
         */
        private Color backgroundVectorRedactor;
        /**
         * Повноекранний режим
         */
        private boolean fullScreen;

        /**
         * Конструктор, який приймає дані
         *
         * @param backgroundVectorRedactor задній фон
         * @param fullScreen               повноекранність
         */
        StatusRedactor(Color backgroundVectorRedactor, boolean fullScreen) {
            this.backgroundVectorRedactor = backgroundVectorRedactor;
            this.fullScreen = fullScreen;
            this.dateSave = getName();
        }


        /**
         * Конструктор, для клонування
         *
         * @param statusRedactor об'єкт для клонування
         */
        StatusRedactor(StatusRedactor statusRedactor) {
            if (statusRedactor == null)
                throw new NullPointerException();
            this.baseShapes = new ArrayList<>();

            for (BaseShape element : statusRedactor.baseShapes) {
                baseShapes.add(element.clone());
            }

            this.backgroundVectorRedactor = statusRedactor.backgroundVectorRedactor;
            this.fullScreen = statusRedactor.fullScreen;

            LocalDateTime dateNow = LocalDateTime.now();
            this.dateSave = dateNow.toString();
        }

        /**
         * Метод для знання імені
         *
         * @return ім'я копії
         */
        @Override
        public String getName() {
            return dateSave;
        }

        /**
         * Метод для виводу
         *
         * @return даних про клас
         */
        @Override
        public String toString() {
            return "StatusRedactor{" +
                "backgroundVectorRedactor=" + backgroundVectorRedactor +
                ", fullScreen=" + fullScreen +
                '}';
        }

        /**
         * Копіювання елемента
         *
         * @return копію елемента
         */
        protected StatusRedactor clone() {
            return new StatusRedactor(this);
        }
    }
}
