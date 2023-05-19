package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression implements GameDesign {
    private static int firstNumber;
    private static int progressionStep;
    private static int missedPositionIndex;
    private final String gameRules = "What number is missing in the progression?";
    public String getGameRules() {
        return gameRules;
    }
    public String gameQuestion() {
        int progressionArrayLength = 10;
        String[] progressionArray = new String[progressionArrayLength];

        firstNumber = Engine.randomNumber(0, 100);
        progressionStep = Engine.randomNumber(1, 20);
        missedPositionIndex = Engine.randomNumber(0, progressionArrayLength - 1);

        for (int i = 0; i < 10; i++) {
            progressionArray[i] = Integer.toString(firstNumber + i * progressionStep);
        }

        progressionArray[missedPositionIndex] = "..";
        return String.join(" ", progressionArray);
    }
    public String gameRightAnswer() {
        return Integer.toString(firstNumber + missedPositionIndex * progressionStep);
    }
}
