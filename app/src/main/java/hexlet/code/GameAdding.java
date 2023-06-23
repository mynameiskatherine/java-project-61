package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

public class GameAdding {

    public static void fillingGameList() {
        GameList.addNewGame(3, "Calc", new Calc());
        GameList.addNewGame(2, "Even", new Even());
        GameList.addNewGame(6, "Prime", new Prime());
        GameList.addNewGame(4, "GCD", new GCD());
        GameList.addNewGame(5, "Progression", new Progression());
    }
}
