package myn.patterns.memento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Клас VectorRedactor як обєкт для зберігання
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
        System.out.println("");
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
        if(previousStatus instanceof StatusRedactor) {
            this.statusRedactor = (StatusRedactor) previousStatus;
        }
        else
            throw new ClassCastException();
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
     * Клас StatusRedactor створює копію обєкту
     */
    private class StatusRedactor implements IStatusRedactor {
        /**
         * Масив фігур копії
         */
        private ArrayList<BaseShape> baseShapes;
        /**
         * Імя копії
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
         * @param statusRedactor обєкт для клонування
         */
        StatusRedactor(StatusRedactor statusRedactor) {
            if(statusRedactor==null)
                throw new NullPointerException();
            this.baseShapes = new ArrayList<>();

            for (BaseShape element : statusRedactor.baseShapes) {
                baseShapes.add(element.clone());
            }

            this.backgroundVectorRedactor = statusRedactor.backgroundVectorRedactor;
            this.fullScreen = statusRedactor.fullScreen;

            Date dateNow = new Date();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'і час' hh:mm:ss a");
            this.dateSave = formatForDateNow.format(dateNow);
        }

        /**
         * Метод для знання імені
         *
         * @return імя копії
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
