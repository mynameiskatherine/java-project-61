package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

public class Calc implements GameDesign {
    private static final int MAXRANDOMNUMBER = 50;
    private static String gameRules = "What is the result of the expression?";
    private static String gameQuestion;
    private static String gameRightAnswer;

    public static void game() {
        getQuestionAnswer();
        Engine.gameEngine(gameRules, gameQuestion, gameRightAnswer);
    }

    private static void getQuestionAnswer() {
        int firstNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        int secondNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        char operation = GameUtils.randomOperation();
        gameQuestion = firstNumber + " " + operation + " " + secondNumber;

        String result = "";
        switch (operation) {
            case '+' -> result = Integer.toString(firstNumber + secondNumber);
            case '-' -> result = Integer.toString(firstNumber - secondNumber);
            case '*' -> result = Integer.toString(firstNumber * secondNumber);
            default -> {
            }
        }
        gameRightAnswer = result;
    }
}
