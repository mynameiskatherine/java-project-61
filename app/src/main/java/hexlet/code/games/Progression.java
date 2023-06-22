package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.GameUtils;

import java.util.Random;

public class Progression implements GameDesign {
    private static final int PROGRESSIONLENGTH = 10;
    private static final int MAXRANDOMNUMBER = 100;
    private static int firstNumber;
    private static int progressionStep;
    private static int missedPositionIndex;

    public final String gameRules() {
        return "What number is missing in the progression?";
    }

    public final String gameQuestion() {
        String[] progressionArray = new String[PROGRESSIONLENGTH];

        firstNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        progressionStep = GameUtils.randomNumber(0, PROGRESSIONLENGTH);
        missedPositionIndex = GameUtils.randomNumber(0, PROGRESSIONLENGTH - 1);

        for (int i = 0; i < PROGRESSIONLENGTH; i++) {
            progressionArray[i] = Integer.toString(firstNumber + i * progressionStep);
        }

        progressionArray[missedPositionIndex] = "..";
        return String.join(" ", progressionArray);
    }

    public final String gameRightAnswer() {
        return Integer.toString(firstNumber + missedPositionIndex * progressionStep);
    }
}
