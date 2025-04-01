package ru.vetl.factory;

import ru.vetl.animals.Animal;
import ru.vetl.animals.birds.IFlying;
import ru.vetl.data.AnimalTypeData;
import ru.vetl.data.ColorData;
import java.util.List;
import java.util.Scanner;


public class AddAnimal {

    public Animal addAnimal(Scanner scanner, List<Animal> animalList) {
        System.out.println("Добавление нового животного");

        AddName addName = new AddName();            //имя животного
        String name = addName.addName(scanner);

        AddAge addAge = new AddAge();               //возраст
        int age = addAge.addAge(scanner, "возраст");


        int weight = addAge.addAge(scanner, "вес");


        AddColor addColor = new AddColor();
        ColorData color = addColor.addColor(scanner);


        AddType addType = new AddType();
        AnimalTypeData type = addType.addType(scanner);


        AnimalFactory factory = new AnimalFactory(name, age, weight, color, type);
        Animal animal = factory.createAnimal(type);

        if (animal != null) {
            animalList.add(animal);
            animal.say();
            animal.drink();
            animal.eat();
            animal.go();
        }

        if (animal instanceof IFlying) {
            ((IFlying) animal).fly();
        }
        return animal;

    }

}
/*
+введите имя
+введите возраст (класс - обработка входных данных)
+введите вес (класс - обработка входных данных)
укажите цвет кожи
укажите тип животного: Duc, Cat, Dog
 */
