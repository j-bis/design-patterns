package singleton;
import java.util.*;
/**
 * prepare for bad javadoc
 * This class creates the game and plays thorugh the trivia game 
 * pulls from class question and plays with instances of it
 * @author Edward Tupacz
 */
public class TriviaGame {
    private static TriviaGame triviagame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;// = new ArrayList<Question>();
    private int r;
    /**
     * private constructor takes dataloader stuff and puts it in questions
     * also sets stuff to this instance and introduces to game
     */
    private TriviaGame() {
        questions = new ArrayList<Question>();
        this.rand = new Random();
        this.reader = new Scanner(System.in);
        System.out.println("Welcome to a trivia game");
        questions = DataLoader.getTriviaQuestions();
    }
    /**
     * makes a new triviagmae if one doesnt exist yet and returns it
     * @return sends this insatance of trivia game and makes new if not one
     */
    public static TriviaGame getInstance() {
        if (triviagame == null) {
            triviagame = new TriviaGame();
        }
        return triviagame;
    }
    /**
     * plays through the game, starts with calling playround to do the round
     * but then does the score calculation and text responses
     * also while loop does the forever thing until the funny break
     */
    public void play() {
        String input;
        if (playRound()) {
            System.out.println("YAY! You got it right!");
            score++;
        } else {
            System.out.println("You got it wrong!");
            System.out.println("The correct answer is " + questions.get(r).getCorrectAnswer());
        }
        //System.out.println("(P)lay or (Q)uit: ");
        reader.nextLine();

        while(true) {
            //input = reader.nextLine();
            System.out.println("(P)lay or (Q)uit: ");
            String playgo = reader.next();
            if (playgo.equalsIgnoreCase("q")) {
                System.out.println("you won " + this.score + " games!");
                System.out.println("BUT you're a quitter so you lose lol");
                break;
            }
            reader.nextLine();
            if (playRound()) {
                System.out.println("YAY! You got it right!");
                score++;
            } else {
                System.out.println("You got it wrong!");
                System.out.println("The correct answer is " + questions.get(r).getCorrectAnswer());
            }
        }
    }
    /**
     * plays the round adn gets a random question and asks for your response
     * @return is your answer correct? i like how i put everything in the return thanks tyler
     */
    private boolean playRound() {
        this.r = rand.nextInt(10);
        System.out.println(questions.get(r));
        System.out.println("\n\nEnter Answer: ");
        //boolean ret = this was for testng ignore
        //reader.nextLine();
        return questions.get(r).isCorrect(reader.nextInt());
    }
    /**
     * i actually didnt need this lol
     * @param r setting this variable wait maybe i shouldve used this to look better
     */
    private void setR(int r) {
        this.r = r;
    }
}
