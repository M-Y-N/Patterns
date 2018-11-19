/**
 * @author Yuriy Senin
 * @version 1.0
 * Головна функція для виклику методів
 */
public class Main {
    public static void main(String[] args) {
        Hummer hummer = new Hummer(2, 5);
        MedicalHummer medHummer = new MedicalHummer(2, 6);
        MilitaryHummer milHummer = new MilitaryHummer(2, 4);
        LevelsWithHummers levelOne = new LevelsWithHummers(hummer, medHummer, milHummer);
        LevelsWithHummers levelTwo = new LevelsWithHummers(levelOne, new MilitaryHummer(3,7), new MilitaryHummer(5, 8));

        levelTwo.findSquare();
    }
}