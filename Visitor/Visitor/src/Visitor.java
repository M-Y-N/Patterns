/**
 * @author Tsaruk Vova
 * Інтерфейс відвідувача, який має 3 перевизначені методи
 */
public interface Visitor {
    /**
     * Метод відвідування елемента
     *
     * @param cableElement - елемент типу CableElement
     */
    void visit(CableElement cableElement);
    /**
     * Метод відвідування елемента
     *
     * @param serverElement - елемент типу ServerElement
     */

    void visit(ServerElement serverElement);
    /**
     * Метод відвідування елемента
     *
     * @param workstationElement - елемент типу WorkstationElement
     */
    void visit(WorkstationElement workstationElement);
}
