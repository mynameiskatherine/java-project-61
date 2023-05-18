package hexlet.code;

import net.sf.saxon.style.XSLOutput;

import java.util.Scanner;

public class Even {
    static String userAnswer;
    public static void main() {
        Scanner scanUserAnswer = new Scanner(System.in);
        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;
        int questionedNumber = 1;
        String rightAnswer = "";
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (rightAnswersCount < 3 && wrongAnswersCount == 0) {
            questionedNumber = (int)Math.round(Math.random() * 100);
            System.out.println("Question: " + questionedNumber);
            System.out.println("Your answer: ");
            userAnswer = ((scanUserAnswer.nextLine()).trim()).toLowerCase();
            rightAnswer = questionedNumber % 2 == 0 ? "yes" : "no";

            if (userAnswer.equalsIgnoreCase(rightAnswer)) {
                rightAnswersCount = rightAnswersCount + 1;
                System.out.println("Correct!");
                if (rightAnswersCount == 3) {
                    System.out.printf("Congratulations, %s!", Cli.getUserName());
                    System.out.println();
                }
            } else {
                wrongAnswersCount = wrongAnswersCount + 1;
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.", userAnswer, rightAnswer);
                System.out.println();
                System.out.printf("Let's try again, %s!", Cli.getUserName());
                System.out.println();
            }
        }

    }
}
