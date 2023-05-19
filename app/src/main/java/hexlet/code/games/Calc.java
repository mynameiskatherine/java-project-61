package hexlet.code.games;

import hexlet.code.Engine;

public class Calc implements GameDesign {

    private static int firstNumber;
    private static int secondNumber;
    private static char operation;
    private final String gameRules = "What is the result of the expression?";

    public String getGameRules() {
        return gameRules;
    }
    public String gameQuestion() {
        firstNumber = Engine.randomNumber(0, 100);
        secondNumber = Engine.randomNumber(0, 20);
        operation = Engine.randomOperation();
        return Integer.toString(firstNumber) + " " + operation + " " + Integer.toString(secondNumber);
    }
    public String gameRightAnswer() {
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
        }
        return Integer.toString(rightAnswer);
    }
}
