package hexlet.code;

import java.util.Scanner;

public class App {
    static int chosenGame;
    public static void main(String[] args) {
        Scanner userChoseGame = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        do {
            System.out.println("Your choice: ");
            chosenGame = userChoseGame.nextInt();
        } while (chosenGame < 0 || chosenGame > 2);

        switch (chosenGame) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                Cli.greeting();
                break;
            case 2:
                Cli.greeting();
                Even.main();
                break;
        }
    }
}
