package hexlet.code;

import java.util.Random;

public class GameUtils {

    private static Random rnd = new Random();
    public static int randomNumber(int start, int bound) {
        return rnd.nextInt(start, bound);
    }

    public static char randomOperation() {
        String operations = "+-*";
        return operations.charAt(rnd.nextInt(operations.length()));
    }
}
