package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.GameUtils;

public class Prime implements GameDesign {
    private static int questionedNumber;
    private static final int MAXRANDOMNUMBER = 1000;

    public final String gameRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public final String gameQuestion() {
        questionedNumber = GameUtils.randomNumber(0, MAXRANDOMNUMBER);
        return Integer.toString(questionedNumber);
    }

    public final String gameRightAnswer() {
        return isPrime(questionedNumber) ? "yes" : "no";
    }

    final boolean isPrime(int number) {
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
