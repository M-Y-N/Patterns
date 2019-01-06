package myn.patterns.memento;
/**
 * @author Ivan Zaichenko
 * @version 1.0
 * Інтерфейс IStatusRedactor, з методоми getName для знання імені
 */
public interface IStatusRedactor {
    /**
     * Метод для знання імені
     *
     * @return імя копії
     */
    String getName();
}
