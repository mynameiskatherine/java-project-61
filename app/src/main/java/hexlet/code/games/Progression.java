package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

import java.util.HashMap;

public class Progression implements GameDesign {
    private static final int PROGRESSIONLENGTH = 10;
    private static final int MAXRANDOMNUMBER = 100;
    private static String gameRules = "What number is missing in the progression?";

    public HashMap<String, String> generateGameQuestionAnswer() {
        HashMap<String, String> result = new HashMap<>();
        String[] progressionArray = new String[PROGRESSIONLENGTH];
        int firstNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        int progressionStep = GameUtils.randomNumber(0, PROGRESSIONLENGTH);
        int missedPositionIndex = GameUtils.randomNumber(0, PROGRESSIONLENGTH - 1);
        for (int i = 0; i < PROGRESSIONLENGTH; i++) {
            progressionArray[i] = Integer.toString(firstNumber + i * progressionStep);
        }
        progressionArray[missedPositionIndex] = "..";
        result.put("question", String.join(" ", progressionArray));
        result.put("answer", Integer.toString(firstNumber + missedPositionIndex * progressionStep));
        return result;
    }

    public final void playGame() {
        Engine.gameEngine(gameRules, new Progression());
    }
}
