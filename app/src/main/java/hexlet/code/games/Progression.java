package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.Engine;
import app.src.main.java.hexlet.code.GameUtils;

public class Progression implements GameDesign {
    private static final int PROGRESSIONLENGTH = 10;
    private static final int MAXRANDOMNUMBER = 100;
    private final String gameRules = "What number is missing in the progression?";
    private static String gameQuestion;
    private static String gameRightAnswer;

    public void game() {
        getQuestionAnswer();
        Engine.gameEngine(gameRules, gameQuestion, gameRightAnswer);
    }
    private static void getQuestionAnswer() {
        String[] progressionArray = new String[PROGRESSIONLENGTH];
        int firstNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        int progressionStep = GameUtils.randomNumber(0, PROGRESSIONLENGTH);
        int missedPositionIndex = GameUtils.randomNumber(0, PROGRESSIONLENGTH - 1);

        for (int i = 0; i < PROGRESSIONLENGTH; i++) {
            progressionArray[i] = Integer.toString(firstNumber + i * progressionStep);
        }

        progressionArray[missedPositionIndex] = "..";
        gameQuestion = String.join(" ", progressionArray);

        gameRightAnswer = Integer.toString(firstNumber + missedPositionIndex * progressionStep);
    }
}
