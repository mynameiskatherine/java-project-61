package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

public class GameAdding {
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;


    public static void fillingGameList() {
        GameList.addNewGame(CALC, "Calc", new Calc());
        GameList.addNewGame(EVEN, "Even", new Even());
        GameList.addNewGame(PRIME, "Prime", new Prime());
        GameList.addNewGame(GCD, "GCD", new GCD());
        GameList.addNewGame(PROGRESSION, "Progression", new Progression());
    }
}
