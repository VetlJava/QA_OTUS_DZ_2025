package ru.vetl.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberTools {

    public boolean isNumber(String numberStr) {
        /*
        Регулярка - это шаблон к которому может соответствовать или нет некая подстрока
        регулярные выражения, попадает ли данные под шаблон.
        Совпадает numberStr этому шаблону "\\b{1,2}" - одна или две цифры
         * */
        Pattern pattern = Pattern.compile("^[1-9]\\d?$");
        /*compile превращает шаблон в паттерн
        класс Matcher ищет совпадения всех строк которые попадают под этот шаблон
        trim() - удаляет пробелы
        * */

        Matcher matcher = pattern.matcher(numberStr.trim());

        //find возвращает true если нашел совпадения
        return matcher.find();
    }
}
