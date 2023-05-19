package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userChoseGame = new Scanner(System.in);
        int numberOfGames = 5;
        int chosenGame = -1;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        do {
            System.out.println("Your choice: ");
            if (userChoseGame.hasNextInt()) {
                chosenGame = userChoseGame.nextInt();
            } else {
                userChoseGame.next();
            }
        } while (chosenGame < 0 || chosenGame > numberOfGames);

        switch (chosenGame) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                Cli.greeting();
                break;
            case 2:
                GameDesign even = new Even();
                Engine.main(even);
                break;
            case 3:
                GameDesign calc = new Calc();
                Engine.main(calc);
                break;
            case 4:
                GameDesign gcd = new GCD();
                Engine.main(gcd);
                break;
            case 5:
                GameDesign progression = new Progression();
                Engine.main(progression);
                break;
        }
    }
}
