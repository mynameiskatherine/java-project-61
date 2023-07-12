package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Engine {
    private static final int MAXRIGHTANSWERS = 3;

    public static void gameEngine(String gameRules, String gameQuestion, String gameRightAnswer) {
        //Greeting part
        String userName;
        Scanner inputName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        do {
            System.out.print("May I have your name? ");
            userName = StringUtils.capitalize(inputName.nextLine());
        }
        while (userName.equals(""));
        System.out.printf("Hello, %s!", userName);
        System.out.println();
        //end
        System.out.println(gameRules);

        Scanner scanUserAnswer = new Scanner(System.in);
        for (int i = 1; i <= MAXRIGHTANSWERS; i++) {
            System.out.println("Question: " + gameQuestion);
            System.out.println("Your answer: ");
            String userAnswer = ((scanUserAnswer.nextLine()).trim()).toLowerCase();

            if (userAnswer.equals(gameRightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. ", userAnswer);
                System.out.printf("Correct answer was '%s'.", gameRightAnswer);
                System.out.println();
                System.out.printf("Let's try again, %s!", userName);
                System.out.println();
                return;
            }
        }
        System.out.printf("Congratulations, %s!", userName);
        System.out.println();
    }
}