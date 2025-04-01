package ru.vetl.factory;

import ru.vetl.data.ColorData;

import java.util.Scanner;

public class AddColor {

    public ColorData addColor(Scanner scanner) {
        System.out.println("Введите цвет животного: ");
        for (ColorData color : ColorData.values()) {
            System.out.println("* " + color.getName());
        }
        while (true) {
            String colorInput = scanner.next().trim();
            for (ColorData color : ColorData.values()) {
                if (color.getName().equalsIgnoreCase(colorInput)) {
                    return color;
                }
            }
            System.out.println("Не верно выбран цвет, введите из предложенных ");
        }
    }
}
