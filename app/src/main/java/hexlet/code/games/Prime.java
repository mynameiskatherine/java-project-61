package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.Engine;
import app.src.main.java.hexlet.code.GameUtils;

public class Prime implements GameDesign {
    private static final int MAXRANDOMNUMBER = 1000;
    private final String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String gameQuestion;
    private static String gameRightAnswer;

    public void game() {
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
