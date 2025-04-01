package ru.vetl.animals;

import ru.vetl.data.AnimalTypeData;
import ru.vetl.data.ColorData;

public abstract class Animal {          //мы запрещаем создание класса Animal
    //поля
    private String name;
    private int age;
    private int weight;
    private ColorData color;
    private AnimalTypeData type;

    //конструктор
    public Animal(String name, int age, int weight, ColorData color, AnimalTypeData type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.type = type;
    }


        public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public ColorData getColor() {
        return color;
    }

    public AnimalTypeData getType() {
        return type;
    }


    //функции
    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }


    //определение год, года, лет
    private String getYearPadej() {
        if (age >= 11 && age <= 14) {
            return "лет";
        }

        int ostatok = age % 10;

        if (ostatok == 1) {
            return "год";
        }
        if (ostatok >= 2 && ostatok <= 4) {
            return "года";
        }
        return "лет";
    }

    //переопределение
    public String toString() {
        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s", name, age,
                getYearPadej(), weight, color.getName());
    }

}