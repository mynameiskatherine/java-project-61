package hexlet.code.games;

import hexlet.code.Engine;

public class Calc implements GameDesign {

    private static int firstNumber;
    private static int secondNumber;
    private static char operation;

    public final String gameRules() {
        return "What is the result of the expression?";
    }
    public final String gameQuestion() {
        firstNumber = Engine.randomNumber();
        secondNumber = Engine.randomNumber();
        operation = Engine.randomOperation();
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
        }
        return Integer.toString(rightAnswer);
    }
}
