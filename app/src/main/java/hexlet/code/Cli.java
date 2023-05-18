package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Cli {
    private static String userName;

    public static void greeting() {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        do {
            System.out.print("May I have your name? ");
            userName = StringUtils.capitalize(inputName.nextLine());
        }
        while (userName.equals(""));
        System.out.printf("Hello, %s!", userName);
        System.out.println();
    }

    public static String getUserName() {
        return userName;
    }
}
