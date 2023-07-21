package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

import java.util.HashMap;

public class Prime implements GameDesign {
    private static final int MAXRANDOMNUMBER = 1000;
    private static String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public HashMap<String, String> generateGameQuestionAnswer() {
        HashMap<String, String> result = new HashMap<>();
        int questionedNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        char operation = GameUtils.randomOperation();
        result.put("question", Integer.toString(questionedNumber));
        result.put("answer", (isPrime(questionedNumber) ? "yes" : "no"));
        return result;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void playGame() {
        Engine.gameEngine(gameRules, new Prime());
    }

}
