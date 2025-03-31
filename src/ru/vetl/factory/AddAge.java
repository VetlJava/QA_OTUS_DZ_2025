package ru.vetl.factory;

import ru.vetl.tools.NumberTools;

import java.util.Scanner;

public class AddAge {

    public int addAge(Scanner scanner, String name) {

        NumberTools numberTools = new NumberTools();
        while (true) {
            System.out.printf("Введите %s : %n", name);
            String input = scanner.next().trim();
            if (numberTools.isNumber(input)) {
                return Integer.parseInt(input);
            } else {
                System.out.printf("Не корректный %s, введите число от 1 до 99.%n", name);
            }
        }
    }
}
