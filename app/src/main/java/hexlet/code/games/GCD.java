package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

import java.util.HashMap;

public class GCD implements GameDesign {
    private static final int MAXRANDOMNUMBER = 100;
    private static String gameRules = "Find the greatest common divisor of given numbers.";

    public final HashMap<String, String> generateGameQuestionAnswer() {
        HashMap<String, String> result = new HashMap<>();
        int firstNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        int secondNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        result.put("question", firstNumber + " " + secondNumber);
        result.put("answer", Integer.toString(findGCD(firstNumber, secondNumber)));
        return result;
    }

    private int findGCD(int firstNumber, int secondNumber) {
        if (firstNumber == 0 && secondNumber != 0) {
            return secondNumber;
        } else if (secondNumber == 0 && firstNumber != 0) {
            return firstNumber;
        } else if (firstNumber == 0 && secondNumber == 0) {
            return 0;
        } else {
            int a = Math.max(firstNumber, secondNumber); // a is greater number
            int b = Math.min(firstNumber, secondNumber); // b is smaller number
            int r = b;
            while (a % b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return r;
        }
    }

    public final void playGame() {
        Engine.gameEngine(gameRules, new GCD());
    }
}
