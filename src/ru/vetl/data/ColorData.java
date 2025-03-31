package ru.vetl.data;

public enum ColorData {
    RED("Красный"), //внутренний статический класс
    GREEN("Зеленый"),
    WHITE("Белый");

    private String name;

    ColorData(String name) {    //this - хранит ссылку на текущий объект
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
