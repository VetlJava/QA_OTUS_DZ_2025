package ru.vetl.animals.birds;

import ru.vetl.animals.Animal;
import ru.vetl.data.AnimalTypeData;
import ru.vetl.data.ColorData;

public class Duck extends Animal implements IFlying {

    public Duck(String name, int age, int weight, ColorData color, AnimalTypeData type) {
        super(name, age, weight, color, type);
    }

    @Override
    public void say() {
        System.out.println("Кря");
    }
}
