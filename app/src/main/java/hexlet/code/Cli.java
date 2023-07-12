package hexlet.code;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner inputName = new Scanner(System.in);
        String userName;
        System.out.println("Welcome to the Brain Games!");
        do {
            System.out.print("May I have your name? ");
            userName = StringUtils.capitalize(inputName.nextLine());
        }
        while (userName.equals(""));
        System.out.printf("Hello, %s!", userName);
        System.out.println();
    }
}
