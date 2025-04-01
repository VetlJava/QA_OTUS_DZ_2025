package ru.vetl.factory;

import java.util.Scanner;

public class AddName {

    public String addName(Scanner scanner) {
        System.out.println("Введите имя животного: ");

        return scanner.next().trim();
    }
}
