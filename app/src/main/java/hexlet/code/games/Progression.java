package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression implements GameDesign {
    private final int progressionArrayLength = 10;
    private static int firstNumber;
    private static int progressionStep;
    private static int missedPositionIndex;
    public final String gameRules() {
        return "What number is missing in the progression?";
    }
    public final String gameQuestion() {
        String[] progressionArray = new String[progressionArrayLength];

        firstNumber = Engine.randomNumber();
        progressionStep = Engine.randomNumber();
        missedPositionIndex = randomArrayIndex();

        for (int i = 0; i < progressionArrayLength; i++) {
            progressionArray[i] = Integer.toString(firstNumber + i * progressionStep);
        }

        progressionArray[missedPositionIndex] = "..";
        return String.join(" ", progressionArray);
    }
    public final String gameRightAnswer() {
        return Integer.toString(firstNumber + missedPositionIndex * progressionStep);
    }

    final int randomArrayIndex() {
        Random rnd = new Random();
        return rnd.nextInt(0, progressionArrayLength - 1);
    }
}
