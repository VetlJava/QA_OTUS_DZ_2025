package ru.vetl.factory;

import ru.vetl.data.AnimalTypeData;

import java.util.Scanner;

public class AddType {

    public AnimalTypeData addType(Scanner scanner) {
        System.out.println("Введите тип животного: ");

        for (AnimalTypeData type : AnimalTypeData.values()) {
            System.out.println("* " + type.getName());
        }

        while (true) {
            String typeInput = scanner.nextLine().trim();
            for (AnimalTypeData type : AnimalTypeData.values()) {
                if (type.getName().equalsIgnoreCase(typeInput)) {
                    return type;
                }
            }
//            System.out.println("Не верно выбран тип животного, введите из предложенных ");
        }
    }
}
