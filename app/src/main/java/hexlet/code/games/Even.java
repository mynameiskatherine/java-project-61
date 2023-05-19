package hexlet.code.games;

import hexlet.code.Engine;

public class Even implements GameDesign {
    private static int questionedNumber;

    @Override
    public String getGameRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    @Override
    public String gameQuestion() {
        questionedNumber = Engine.randomNumber(0, 100);
        return Integer.toString(questionedNumber);
    }
    @Override
    public String gameRightAnswer() {
        return questionedNumber % 2 == 0 ? "yes" : "no";
    }
}
