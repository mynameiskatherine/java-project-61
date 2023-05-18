package hexlet.code.games;

import hexlet.code.Engine;

public class GCD implements GameDesign {

    private static int firstNumber;
    private static int secondNumber;
    private final String gameRules = "Find the greatest common divisor of given numbers.";
    public String getGameRules() {
        return gameRules;
    }
    public String gameQuestion() {
        firstNumber = Engine.getRandomNumber();
        secondNumber = Engine.getRandomNumber();
        return Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
    }
    public String gameRightAnswer() {
        int r = 0, a, b;
        a = (firstNumber > secondNumber) ? firstNumber : secondNumber; // a is greater number
        b = (firstNumber < secondNumber) ? firstNumber : secondNumber; // b is smaller number
        r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return Integer.toString(r);
    }
}
