package hexlet.code.games;

import hexlet.code.Engine;

public class Progression implements GameDesign {
    private static int firstNumber;
    private static int progressionStep;
    private static int missedPositionIndex;
    @Override
    public String getGameRules() {
        return "What number is missing in the progression?";
    }
    @Override
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
    @Override
    public String gameRightAnswer() {
        return Integer.toString(firstNumber + missedPositionIndex * progressionStep);
    }
}
