package hexlet.code;

import hexlet.code.games.GameDesign;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static final int MAXRANDOMNUMBER = 100;
    private static int MAXRIGHTANSWERS = 3;
    public static int randomNumber() {
        Random rnd = new Random();
        return rnd.nextInt(MAXRANDOMNUMBER);
    }
    public static char randomOperation() {
        Random rnd = new Random();
        String operations = "+-*";
        return operations.charAt(rnd.nextInt(operations.length()));
    }

    public static void gameEngine(GameDesign gameType) {
        Cli.greeting();
        System.out.println(gameType.gameRules());

        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;

        Scanner scanUserAnswer = new Scanner(System.in);

        while (rightAnswersCount < MAXRIGHTANSWERS && wrongAnswersCount == 0) {
            System.out.println("Question: " + gameType.gameQuestion());
            System.out.println("Your answer: ");
            String userAnswer = ((scanUserAnswer.nextLine()).trim()).toLowerCase();

            if (userAnswer.equals(gameType.gameRightAnswer())) {
                rightAnswersCount = rightAnswersCount + 1;
                System.out.println("Correct!");
            } else {
                wrongAnswersCount = wrongAnswersCount + 1;
                System.out.printf("'%s' is wrong answer ;(. ", userAnswer);
                System.out.printf("Correct answer was '%s'.", gameType.gameRightAnswer());
                System.out.println();
            }
        }
        if (wrongAnswersCount == 0 && rightAnswersCount == MAXRIGHTANSWERS) {
            System.out.printf("Congratulations, %s!", Cli.getUserName());
            System.out.println();
        } else {
            System.out.printf("Let's try again, %s!", Cli.getUserName());
            System.out.println();

        }

    }
}
