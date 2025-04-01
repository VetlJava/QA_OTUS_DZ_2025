package ru.vetl;

import ru.vetl.animals.Animal;
import ru.vetl.data.CommandsData;
import ru.vetl.factory.AddAnimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        List<String> nameStr = new ArrayList<>();
        for(CommandsData commandsData: CommandsData.values()) {
            nameStr.add(commandsData.name());
            //возвращает значение enum CommandsData, можно вывести в нижнем рег .toLowerCase()
        }

        while (true) {
            System.out.println(String.format("Введите команду: %s", String.join("/", nameStr)));
            //String.join принимает разделитель и дальше принимает массив nameStr, т.е. add/list/exit

            String userCommand = scanner.nextLine().trim().toUpperCase();

            String userCommandUpperCase = userCommand.toUpperCase();

            //проверка команды, что ввел пользователь
            boolean isCommandExist = false;
            for(CommandsData commandsData: CommandsData.values()) {
                if(userCommand.equals(commandsData.name())) {
                    isCommandExist = true;
                    break;
                }
            }
            //если команда не найдена
            if(!isCommandExist) {
                System.out.printf("Команда %s не поддерживается\n", userCommand);
                continue;   //переход к следующей итерации цикла
            }


            switch (CommandsData.valueOf(userCommandUpperCase)) {
                case ADD: {
                    AddAnimal addAnimal = new AddAnimal();
                    Animal animal = addAnimal.addAnimal(scanner, animals);
                    System.out.println(animal);
                    break;
                }
                case LIST: {
                    if (animals.isEmpty()) {
                        System.out.println("Животных нет, список пуст.");
                    }

                    for ( Animal animal : animals) {
                        System.out.println(animal);
                    }
                }
                break;

                case EXIT: {
                    System.out.println("Программа завершила работу");
                   System.exit(0);  //все что не 0 - ошибка
                }
            }
        }
    }
}
