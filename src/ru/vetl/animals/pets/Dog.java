package ru.vetl.animals.pets;

import ru.vetl.animals.Animal;
import ru.vetl.data.AnimalTypeData;
import ru.vetl.data.ColorData;

public class Dog extends Animal {
    //конструктор
    public Dog(String name, int age, int weight, ColorData color, AnimalTypeData type) {
        //явный вызов конструктора абстрактного класса
        super(name, age, weight, color, type);
    }

    public void say() {
        System.out.println("Гав");
    }
}
