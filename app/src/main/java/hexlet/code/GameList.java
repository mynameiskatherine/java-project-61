package hexlet.code;

import hexlet.code.games.GameDesign;
import java.util.HashMap;

public class GameList {
    private static HashMap<Integer, GameDesign> gameList = new HashMap<Integer, GameDesign>();

    public static void addNewGame(int gameId, String gameName, GameDesign gameType) {
        gameList.put(gameId, gameType);
        Menu.addToMenu(gameId, gameName);
    }

    public static boolean containingGameInMenu(int gameId) {
        return gameList.containsKey(gameId);
    }

    public static GameDesign getGame(int gameId) {
        return gameList.get(gameId);
    }
}
