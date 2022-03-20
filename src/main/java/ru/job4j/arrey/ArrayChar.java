package ru.job4j.arrey;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            if (word[index] == pref[index]) {
                result = true;
                break;
            }
        }
        return result;
    }

}
