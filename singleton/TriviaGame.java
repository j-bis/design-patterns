package singleton;
import java.util.*;

public class TriviaGame {
    private static TriviaGame triviagame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions = new ArrayList<Question>();

    private TriviaGame() {
        this.rand = new Random();
        this.reader = new Scanner();

    }

    public static TriviaGame getInstance() {
        if (triviagame == null) {
            triviagame = new TriviaGame();
        }
        return triviagame;
    }

    public void play() {

    }

    private boolean playRound() {

    }
}
