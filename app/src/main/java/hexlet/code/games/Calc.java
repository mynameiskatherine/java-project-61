package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

public class Calc implements GameDesign {
    private static final int MAXRANDOMNUMBER = 50;
    private final String gameRules = "What is the result of the expression?";
    private static String gameQuestion;
    private static String gameRightAnswer;

    public void game() {
        getQuestionAnswer();
        Engine.gameEngine(gameRules, gameQuestion, gameRightAnswer);
    }

    private void getQuestionAnswer() {
        int firstNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        int secondNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        char operation = GameUtils.randomOperation();
        gameQuestion = firstNumber + " " + operation + " " + secondNumber;

        switch (operation) {
            case '+' -> gameRightAnswer = Integer.toString(firstNumber + secondNumber);
            case '-' -> gameRightAnswer = Integer.toString(firstNumber - secondNumber);
            case '*' -> gameRightAnswer = Integer.toString(firstNumber * secondNumber);
            default -> {
            }
        }
    }
}
