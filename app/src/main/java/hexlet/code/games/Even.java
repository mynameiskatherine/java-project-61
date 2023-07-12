package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

public class Even implements GameDesign {
    private static final int MAXRANDOMNUMBER = 10000;
    private static String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String gameQuestion;
    private static String gameRightAnswer;

    public final void playGame() {
        getQuestionAnswer();
        Engine.gameEngine(gameRules, gameQuestion, gameRightAnswer);
    }

    private void getQuestionAnswer() {
        int questionedNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        gameQuestion = Integer.toString(questionedNumber);
        gameRightAnswer = questionedNumber % 2 == 0 ? "yes" : "no";
    }
}
