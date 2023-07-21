package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

import java.util.HashMap;

public class Even implements GameDesign {
    private static final int MAXRANDOMNUMBER = 10000;
    private static String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public HashMap<String, String> generateGameQuestionAnswer() {
        HashMap<String, String> result = new HashMap<>();
        int questionedNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        result.put("question", Integer.toString(questionedNumber));
        result.put("answer", (questionedNumber % 2 == 0 ? "yes" : "no"));
        return result;
    }

    public final void playGame() {
        Engine.gameEngine(gameRules, new Even());
    }
}
