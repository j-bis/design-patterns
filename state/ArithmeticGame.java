import java.util.Scanner;
/**
 * class that returns questions and does computations with user input
 * @author Edward Tupacz
 */
public class ArithmeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score = 0;
    private Scanner reader;
    /**
     * constructor for game when instance called, sets up basic variables
     */
    public ArithmeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        reader = new Scanner(System.in);
        this.state = getEasyState();
    }
    /**
     * when question is requested returns question based on state of difficulty
     */
    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        int ret = 0;
        int ans = 0;
        switch (state.getOperation()) {
            case("+"): System.out.println(num1 + " + " + num2 + ": "); 
                ans = num1 + num2;
                ret = reader.nextInt();
                break;
            case("-"): System.out.println(num1 + " - " + num2 + ": "); 
                ans = num1 - num2;
                ret = reader.nextInt();
                break;
            case("*"): System.out.println(num1 + " * " + num2 + ": "); 
                ans = num1 * num2;
                ret = reader.nextInt();
                break;
            case("/"): System.out.println(num1 + " / " + num2 + ": "); 
                ans = num1 / num2;
                ret = reader.nextInt();
                break;
        }
        if (ret == ans) {
            System.out.println("Correct");
            score++;
        } else {
            System.out.println("incorrect");
            score--;
        }
        if (score >= 3) {
            state.levelUp();
            score = 0;
        } else if (score <= -3) {
            state.levelDown();
            score = 0;     
        }

    }
    /**
     * changes game state, making it harder or easier
     * @param state state to be changed to
     */
    public void setState(State state) {
        this.state = state;
    }
    /**
     * gets easy state set up in constructor
     * @return easy state of game
     */
    public State getEasyState() {
        return easyState;
    }
    /**
     * gets medium state set up in constructor
     * @return medium state of game
     */
    public State getMediumState() {
        return mediumState; 
    }
    /**
     * gets medium state set up in constructor
     * @return medium state of game
     */
    public State getHardState() {
        return hardState;
    }
}
