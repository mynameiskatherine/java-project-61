package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import net.sf.saxon.style.XSLOutput;

import java.util.Scanner;

public class Even implements GameDesign {
    
    private static int questionedNumber;
    private final String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public String getGameRules() {
        return gameRules;
    }
    public String gameQuestion() {
        questionedNumber = Engine.getRandomNumber();
        return Integer.toString(questionedNumber);
    }
    public String gameRightAnswer() {
        String rightAnswer = questionedNumber % 2 == 0 ? "yes" : "no";
        return rightAnswer;
    }

}
