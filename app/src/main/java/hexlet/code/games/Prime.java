package hexlet.code.games;

import hexlet.code.Engine;

public class Prime implements GameDesign {
    private static int questionedNumber;
    public final String gameRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public final String gameQuestion() {
        questionedNumber = Engine.randomNumber();
        return Integer.toString(questionedNumber);
    }
    public final String gameRightAnswer() {
        return isPrime(questionedNumber) ? "yes" : "no";
    }
    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
