package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GameDesign;
import java.util.Scanner;

public class App {
    private static final int MAXMENUPOINT = 6;
    public static void main(String[] args) {
        Scanner userChoseGame = new Scanner(System.in);
        int chosenGame = -1;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        do {
            System.out.println("Your choice: ");
            if (userChoseGame.hasNextInt()) {
                chosenGame = userChoseGame.nextInt();
            } else {
                userChoseGame.next();
            }
        } while (chosenGame < 0 || chosenGame > MAXMENUPOINT);

        switch (Integer.toString(chosenGame)) {
            case "0":
                System.out.println("Bye!");
                break;
            case "1":
                Cli.greeting();
                break;
            case "2":
                GameDesign even = new Even();
                Engine.gameEngine(even);
                break;
            case "3":
                GameDesign calc = new Calc();
                Engine.gameEngine(calc);
                break;
            case "4":
                GameDesign gcd = new GCD();
                Engine.gameEngine(gcd);
                break;
            case "5":
                GameDesign progression = new Progression();
                Engine.gameEngine(progression);
                break;
            case "6":
                GameDesign prime = new Prime();
                Engine.gameEngine(prime);
                break;
            default:
                break;
        }
    }
}
