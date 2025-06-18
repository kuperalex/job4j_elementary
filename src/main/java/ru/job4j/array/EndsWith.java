package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] world, char[] postfix) {
        boolean result = true;
        for (int index = 0; index < world.length; index++) {
            if (postfix[postfix.length - 1] != world[world.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
