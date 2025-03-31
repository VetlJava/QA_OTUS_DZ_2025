package ru.vetl.factory;

import ru.vetl.animals.Animal;
import ru.vetl.animals.birds.Duck;
import ru.vetl.animals.pets.Cat;
import ru.vetl.animals.pets.Dog;
import ru.vetl.data.AnimalTypeData;
import ru.vetl.data.ColorData;

public class AnimalFactory {

    private String name;
    private int age;
    private int weight;
    private ColorData colorData;
    private AnimalTypeData type;

    public AnimalFactory(String name, int age, int weight, ColorData colorData, AnimalTypeData type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colorData = colorData;
        this.type = type;
    }

    public Animal createAnimal(AnimalTypeData animalTypeData) {
        switch (animalTypeData) {
            case CAT: {
                return new Cat(name, age, weight, colorData, type);
            }
            case DOG: {
                return new Dog(name, age, weight, colorData, type);
            }
            case DUCK: {
                return new Duck(name, age, weight, colorData, type);
            }
        }

        return null;
    }
}
