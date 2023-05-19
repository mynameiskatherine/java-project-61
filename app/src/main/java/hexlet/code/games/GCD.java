package hexlet.code.games;

import hexlet.code.Engine;

public class GCD implements GameDesign {

    private static int firstNumber;
    private static int secondNumber;

    public final String gameRules() {
        return "Find the greatest common divisor of given numbers.";
    }
    public final String gameQuestion() {
        firstNumber = Engine.randomNumber();
        secondNumber = Engine.randomNumber();
        return firstNumber + " " + secondNumber;
    }
    public final String gameRightAnswer() {
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
