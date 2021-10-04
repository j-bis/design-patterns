package singleton;
import java.util.*;

public class TriviaGame {
    private static TriviaGame triviagame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int r;

    private TriviaGame() {
        this.rand = new Random();
        this.reader = new Scanner(System.in);
        System.out.println("Welcome to a trivia game");
        DataLoader.getTriviaQuestions();
    }

    public static TriviaGame getInstance() {
        if (triviagame == null) {
            triviagame = new TriviaGame();
        }
        return triviagame;
    }

    public void play() {
        String input;
        if (playRound()) {
            System.out.println("YAY! You got it right!");
            score++;
        } else {
            System.out.println("You got it wrong!");
            System.out.println("The correct answer is" + questions.get(r).getCorrectAnswer());
        }
        System.out.println("(P)lay or (Q)uit: ");
        reader.nextLine();

        while(true) {
            //input = reader.nextLine();
            if (reader.nextLine().equalsIgnoreCase("q")) {
                break;
            }
            if (playRound()) {
                System.out.println("YAY! You got it right!");
                score++;
            } else {
                System.out.println("You got it wrong!");
                System.out.println("The correct answer is" + questions.get(r).getCorrectAnswer());
            }
        }
    }

    private boolean playRound() {
        this.r = rand.nextInt(10);
        System.out.println(questions.get(r));
        System.out.println("\n\nEnter Answer: ");
        return questions.get(r).isCorrect(reader.nextInt());
        //reader.nextLine();
    }
    
    private void setR(int r) {
        this.r = r;
    }
}
