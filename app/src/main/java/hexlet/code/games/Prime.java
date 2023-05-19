package hexlet.code.games;

import hexlet.code.Engine;

public class Prime implements GameDesign {
    private static int questionedNumber;
    private final String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public String getGameRules() {
        return gameRules;
    }
    public String gameQuestion() {
        questionedNumber = Engine.randomNumber(0, 500);
        return Integer.toString(questionedNumber);
    }
    public String gameRightAnswer() {
        String rightAnswer = isPrime(questionedNumber) ? "yes" : "no";
        return rightAnswer;
    }
    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
