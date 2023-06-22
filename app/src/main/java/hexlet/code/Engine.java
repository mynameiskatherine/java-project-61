package app.src.main.java.hexlet.code;

import app.src.main.java.hexlet.code.games.GameDesign;
import java.util.Scanner;

public class Engine {
    private static final int MAXRIGHTANSWERS = 3;

    public static void gameEngine(GameDesign gameType) {
        Cli.greeting();
        System.out.println(gameType.gameRules());

        Scanner scanUserAnswer = new Scanner(System.in);
        for (int i = 1; i <= MAXRIGHTANSWERS; i++) {
            System.out.println("Question: " + gameType.gameQuestion());
            System.out.println("Your answer: ");
            String userAnswer = ((scanUserAnswer.nextLine()).trim()).toLowerCase();

            if (userAnswer.equals(gameType.gameRightAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. ", userAnswer);
                System.out.printf("Correct answer was '%s'.", gameType.gameRightAnswer());
                System.out.println();
                System.out.printf("Let's try again, %s!", Cli.getUserName());
                System.out.println();
                return;
            }
        }
        System.out.printf("Congratulations, %s!", Cli.getUserName());
        System.out.println();
    }
}
