package hexlet.code;

public class App {
    public static void main(String[] args) {

        GameAdding.fillingGameList();

        System.out.println("Please enter the game number and press Enter.");
        Menu.printMenu();

        int chosenPoint = Menu.choseMenuPoint();

        if (GameList.containingGameInMenu(chosenPoint)) {
            (GameList.getGame(chosenPoint)).playGame();
        } else {
            switch (chosenPoint) {
                case 0 -> System.out.println("Bye!");
                case 1 -> Cli.greeting();
                default -> throw new Error("Unknown chosenPoint: " + chosenPoint);
            }
        }
    }
}
