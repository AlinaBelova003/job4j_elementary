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
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            validateBadRequest(code);
            if (isSpecialSymbol(code) || isUpperLatinLatter(code) || isLowerLatinLatter(code)) {
                return true;
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

    /**
     * Проверка неправильных запросов:
     * Код пустой, начало с Прописной буквы или код из цифр
     */
    public static boolean validateBadRequest(int code) {
        boolean result = true;
        String codeString = Integer.toString(code);
        if (!codeString.isEmpty()) {
            for (int i = 0; i < codeString.length(); i++) {
                char codeChar = codeString.charAt(0);
                if (Character.isUpperCase(codeChar)) {
                    result = false;
                }
                if  (Character.isDigit(codeChar)) {
                    result = false;
                }
            }
        }
        return result;
    }
}