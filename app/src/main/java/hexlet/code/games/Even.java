package hexlet.code.games;

import hexlet.code.Engine;

public class Even implements GameDesign {
    private static int questionedNumber;

    public final String gameRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public final String gameQuestion() {
        questionedNumber = Engine.randomNumber();
        return Integer.toString(questionedNumber);
    }
    public final String gameRightAnswer() {
        return questionedNumber % 2 == 0 ? "yes" : "no";
    }
}
