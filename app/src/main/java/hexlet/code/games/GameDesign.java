package hexlet.code.games;

import java.util.HashMap;

public interface GameDesign {
    void playGame();

     HashMap<String, String> generateGameQuestionAnswer();
}
