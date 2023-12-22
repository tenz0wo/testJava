package ru.koryshev.task3;

import java.util.regex.Pattern;

public class StringValidator {
    private static final Pattern INVALID_CHARACTERS_PATTERN = Pattern.compile("[*&{}|+;,]");

    public static boolean isValidString(String input) {
        if (input.length() < 4 || input.length() > 16) {
            return false;
        }
        return !INVALID_CHARACTERS_PATTERN.matcher(input).find();
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "abcd",              // Валидная строка
                "abc*",              // Недопустимый символ *
                "abcdefghijklmnopqrstuvwxyz"  // Длина превышает 16 символов
        };

        for (String testString : testStrings) {
            if (isValidString(testString)) {
                System.out.println(testString + " - Валидная строка");
            } else {
                System.out.println(testString + " - Недопустимая строка");
            }
        }
    }
}
