package edu;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Arr {
    public static void main(String[] args) {
        String text = "Добро пожаловать на мой сайт. Дорогие дамы и господа. Рад вас всех видеть. В данном тексте " +
                "есть почта gerasimuz@gmail.com. Это моя почта будем ее пытаться выщемить";

        Pattern email = Pattern.compile("((\\w+)@\\(gmail|yandex)\\.(com|ru)");


    }
}
