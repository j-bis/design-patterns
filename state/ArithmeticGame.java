import java.util.Scanner;
public class ArithmeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    public ArithmeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        reader = new Scanner(System.in);
    }

    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        int ret = 0;
        int ans = 0;
        switch (state.getOperation()) {
            case("+"): System.out.println(num1 + " + " + num2 + ": "); 
                ans = num1 + num2;
                ret = reader.nextInt();
            case("-"): System.out.println(num1 + " - " + num2 + ": "); 
                ans = num1 - num2;
                ret = reader.nextInt();
            case("*"): System.out.println(num1 + " * " + num2 + ": "); 
                ans = num1 * num2;
                ret = reader.nextInt();
            case("/"): System.out.println(num1 + " / " + num2 + ": "); 
                ans = num1 / num2;
                ret = reader.nextInt();
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
        }
        if (score <= 3) {
            state.levelDown();
        }

    }

    public void setState(State State) {
        this.state = state;
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState; 
    }

    public State getHardState() {
        return hardState;
    }
}
