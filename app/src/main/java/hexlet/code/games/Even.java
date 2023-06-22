package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.GameUtils;

public class Even implements GameDesign {
    private static int questionedNumber;
    private static final int MAXRANDOMNUMBER = 10000;

    public final String gameRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public final String gameQuestion() {
        questionedNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        return Integer.toString(questionedNumber);
    }

    public final String gameRightAnswer() {
        return questionedNumber % 2 == 0 ? "yes" : "no";
    }
}
