package ru.vetl.factory;

import java.util.Scanner;

public class AddWeight {
    public String addWeight(Scanner scanner) {
        System.out.println("Введите вес животного: ");

        return scanner.next().trim();
    }
}
