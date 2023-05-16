package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Cli {
    static String userName;

    public static void greeting() {
        Scanner inputName = new Scanner(System.in);
        do {
            System.out.println("May I have your name?");
            userName = inputName.nextLine();
        }
        while (userName == "");
        System.out.println("Hello, " + StringUtils.capitalize(userName) + "!");
    }
}
