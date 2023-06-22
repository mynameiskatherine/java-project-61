package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.GameUtils;

public class GCD implements GameDesign {
    private static final int MAXRANDOMNUMBER = 100;
    private static int firstNumber;
    private static int secondNumber;

    public final String gameRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public final String gameQuestion() {
        firstNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        secondNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        return firstNumber + " " + secondNumber;
    }

    public final String gameRightAnswer() {
        if (firstNumber == 0 || secondNumber == 0) {
            return Integer.toString(0);
        } else {
            int a = Math.max(firstNumber, secondNumber); // a is greater number
            int b = Math.min(firstNumber, secondNumber); // b is smaller number
            int r = b;
            while (a % b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return Integer.toString(r);
        }
    }
}
