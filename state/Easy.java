import java.util.Random;
/**
 * easy state of the game
 */
public class Easy implements State {
    private ArithmeticGame game;
    private Random r;
    /**
     * constructor for easy state
     * @param game game that is being played is held in state class
     */
    public Easy(ArithmeticGame game) {
        this.game = game;
        r = new Random();
    }
    /**
     * returns easy numbers to do in your head
     * @return 1-10
     */
    public int getNum() {
        return (r.nextInt(10) + 1);
    }
    /**
     * returns the operation to perform
     * @return + or -
     */
    public String getOperation() {
        if (r.nextInt(2) != 0) {
            return "+";
        }
        return "-";
    }
    /**
     * sends you to next difficulty by changing state
     */
    public void levelUp() {
        game.setState(game.getMediumState());
        System.out.println("ok ok i see you");
    }
    /**
     * says youre bad because you cant get any worse
     */
    public void levelDown() {
        System.out.println("youre bad");
    }
}
