package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.GameUtils;

public class Calc implements GameDesign {
    private static final int MAXRANDOMNUMBER = 50;
    private static int firstNumber;
    private static int secondNumber;
    private static char operation;

    public final String gameRules() {
        return "What is the result of the expression?";
    }

    public final String gameQuestion() {
        firstNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        secondNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        operation = GameUtils.randomOperation();
        return firstNumber + " " + operation + " " + secondNumber;
    }

    public final String gameRightAnswer() {
        int rightAnswer = 0;
        switch (operation) {
            case '+':
                rightAnswer = firstNumber + secondNumber;
                break;
            case '-':
                rightAnswer = firstNumber - secondNumber;
                break;
            case '*':
                rightAnswer = firstNumber * secondNumber;
                break;
            default:
                break;
        }
        return Integer.toString(rightAnswer);
    }
}
