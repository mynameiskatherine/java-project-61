package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

import java.util.HashMap;

public class Calc implements GameDesign {
    private static final int MAXRANDOMNUMBER = 50;
    private static String gameRules = "What is the result of the expression?";

    public HashMap<String, String> generateGameQuestionAnswer() {
        HashMap<String, String> result = new HashMap<>();
        int firstNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        int secondNumber = GameUtils.randomNumber(-MAXRANDOMNUMBER, MAXRANDOMNUMBER);
        char operation = GameUtils.randomOperation();
        result.put("question", firstNumber + " " + operation + " " + secondNumber);
        result.put("answer", Integer.toString(makeOperation(operation, firstNumber, secondNumber)));
        return result;
    }

    private static int makeOperation(char operation, int firstNumber, int secondNumber) {
        switch (operation) {
            case '+' -> {
                return (firstNumber + secondNumber);
            }
            case '-' -> {
                return (firstNumber - secondNumber);
            }
            case '*' -> {
                return (firstNumber * secondNumber);
            }
            default -> {
                return 0;
            }
        }
    }

    public final void playGame() {
        Engine.gameEngine(gameRules, new Calc());
    }
}
