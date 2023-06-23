package hexlet.code;

import java.util.Random;

public class GameUtils {

    public static int randomNumber(int start, int bound) {
        Random rnd = new Random();
        return rnd.nextInt(start, bound);
    }

    public static char randomOperation() {
        Random rnd = new Random();
        String operations = "+-*";
        return operations.charAt(rnd.nextInt(operations.length()));
    }
}
