package hexlet.code;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private static HashMap<Integer, String> menu = new HashMap<Integer, String>() {{
        put(0, "Exit");
        put(1, "Greet");
    }};

    public static void addToMenu(int point, String pointName) {
        menu.put(point, pointName);
    }

    public static void printMenu() {
        for (int i = 1; i < menu.size(); i++) {
            System.out.println(i + " - " + menu.get(i));
        }
        System.out.println(0 + " - " + menu.get(0));
    }

    public static boolean containingInMenu(int point) {
        return menu.containsKey(point);
    }

    public static int choseMenuPoint() {
        Scanner userChoice = new Scanner(System.in);
        int chosenPoint = -1;
        do {
            System.out.println("Your choice: ");
            if (userChoice.hasNextInt()) {
                chosenPoint = userChoice.nextInt();
            } else {
                userChoice.next();
            }
        } while (!Menu.containingInMenu(chosenPoint));
        return chosenPoint;
    }
}
