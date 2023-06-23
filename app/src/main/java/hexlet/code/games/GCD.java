package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

public class GCD implements GameDesign {
    private static final int MAXRANDOMNUMBER = 100;
    private static String gameRules = "Find the greatest common divisor of given numbers.";
    private static String gameQuestion;
    private static String gameRightAnswer;

    public static void game() {
        getQuestionAnswer();
        Engine.gameEngine(gameRules, gameQuestion, gameRightAnswer);
    }

    private static void getQuestionAnswer() {
        int firstNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        int secondNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        gameQuestion = firstNumber + " " + secondNumber;

        if (firstNumber == 0 || secondNumber == 0) {
            gameRightAnswer = Integer.toString(0);
        } else {
            int a = Math.max(firstNumber, secondNumber); // a is greater number
            int b = Math.min(firstNumber, secondNumber); // b is smaller number
            int r = b;
            while (a % b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            gameRightAnswer = Integer.toString(r);
        }
    }
}
