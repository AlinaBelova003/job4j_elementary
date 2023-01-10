package ru.job4j.arrey;

import java.nio.charset.Charset;

/**
 * Валидация имен
 */
public class JavaNameValidator {
    /**
     * Проверка валидации имен
     * @param name входное имя
     */
    public static boolean isNameValid(String name) {
        if (!name.isEmpty() && !Character.isUpperCase(name.charAt(0))) {
            for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isSpecialSymbol(code) || isUpperLatinLatter(code)
                    || isLowerLatinLatter(code) || !Character.isDigit(name.codePointAt(0))) {
                return true;
            }
        }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLatter(int code) {
        return code > 65 && code < 90;
    }

    public static boolean isLowerLatinLatter(int code) {
        return  code > 97 && code < 122;
    }
}