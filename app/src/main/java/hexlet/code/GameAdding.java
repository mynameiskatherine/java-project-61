package app.src.main.java.hexlet.code;

import app.src.main.java.hexlet.code.games.Calc;
import app.src.main.java.hexlet.code.games.Even;
import app.src.main.java.hexlet.code.games.Prime;
import app.src.main.java.hexlet.code.games.GCD;
import app.src.main.java.hexlet.code.games.Progression;

public class GameAdding {

    public static void fillingGameList() {
        GameList.addNewGame(3, "Calc", new Calc());
        GameList.addNewGame(2, "Even", new Even());
        GameList.addNewGame(6, "Prime", new Prime());
        GameList.addNewGame(4, "GCD", new GCD());
        GameList.addNewGame(5, "Progression", new Progression());
    }
}
