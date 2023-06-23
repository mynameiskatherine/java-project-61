package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.Engine;
import app.src.main.java.hexlet.code.GameUtils;

public class Even implements GameDesign {
    private static final int MAXRANDOMNUMBER = 10000;
    public final String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String gameQuestion;
    private static String gameRightAnswer;

    public void game() {
        getQuestionAnswer();
        Engine.gameEngine(gameRules, gameQuestion, gameRightAnswer);
    }

    private void getQuestionAnswer() {
        int questionedNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        gameQuestion = Integer.toString(questionedNumber);
        gameRightAnswer = questionedNumber % 2 == 0 ? "yes" : "no";
    }
}
