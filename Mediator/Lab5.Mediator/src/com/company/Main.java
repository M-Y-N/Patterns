package com.company;

/**
 * @author Sienin Yuriy
 * @version 1.0
 * Головний клас Main для запуску програми
 */

public class Main {
    public static void main(String[] args) {

        FirstLvLPlayField playField = new FirstLvLPlayField();

        Cell green1 = new GreenCell(playField, "First Green");
        Cell green2 = new GreenCell(playField, "Second Green");

        Cell red1 = new RedCell(playField, "First Red");
        Cell red2 = new RedCell(playField, "Second Red");

        playField.addCell(green1);
        playField.addCell(green2);
        playField.addCell(red1);
        playField.addCell(red2);

        System.out.println("Begin");
        playField.print();

        System.out.println("Changes: ");
        playField.changeActive(false, green1);
        System.out.println("");
        playField.changeActive(false, red1);
        System.out.println("");
        playField.changeActive(true, red2);
        System.out.println("");

        System.out.println("last Version");
        playField.print();
    }
}




