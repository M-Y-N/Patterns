/**
 * @author Sienin Yuriy
 * @version 1.0
 * Інтерфейс PlayField, для медіатора
 */
package myn.patterns.Mediator.lab5;

interface PlayField {
    void changeActive(boolean changeActive, Cell cell);
}