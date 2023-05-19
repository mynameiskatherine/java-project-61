package hexlet.code;

import hexlet.code.games.GameDesign;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int randomNumber(int start, int bound) {
        Random rnd = new Random();
        return rnd.nextInt(start, bound);
    }
    public static char randomOperation() {
        Random rnd = new Random();
        String operations = "+-*";
        return operations.charAt(rnd.nextInt(operations.length()));
    }

    public static void gameEngine(GameDesign gameType) {
        Cli.greeting();
        System.out.println(gameType.getGameRules());

        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;

        Scanner scanUserAnswer = new Scanner(System.in);

        while (rightAnswersCount < 3 && wrongAnswersCount == 0) {
            System.out.println("Question: " + gameType.gameQuestion());
            System.out.println("Your answer: ");
            String userAnswer = ((scanUserAnswer.nextLine()).trim()).toLowerCase();

            if (userAnswer.equals(gameType.gameRightAnswer())) {
                rightAnswersCount = rightAnswersCount + 1;
                System.out.println("Correct!");
            } else {
                wrongAnswersCount = wrongAnswersCount + 1;
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.", userAnswer, gameType.gameRightAnswer());
                System.out.println();
            }
        }
        if (wrongAnswersCount == 0 && rightAnswersCount == 3) {
            System.out.printf("Congratulations, %s!", Cli.getUserName());
            System.out.println();
        } else {
            System.out.printf("Let's try again, %s!", Cli.getUserName());
            System.out.println();

        }

    }
}