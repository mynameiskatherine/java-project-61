package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

public class Prime implements GameDesign {
    private static final int MAXRANDOMNUMBER = 1000;
    private static String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String gameQuestion;
    private static String gameRightAnswer;

    public final void playGame() {
        getQuestionAnswer();
        Engine.gameEngine(gameRules, gameQuestion, gameRightAnswer);
    }

    private void getQuestionAnswer() {
        int questionedNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        gameQuestion = Integer.toString(questionedNumber);
        gameRightAnswer = isPrime(questionedNumber) ? "yes" : "no";
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
}
