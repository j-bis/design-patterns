import java.util.Random;
/**
 * medium state of the game
 */
public class Medium implements State {
    private ArithmeticGame game;
    private Random r;
    /**
     * constructor for difficulty level
     * @param game game being played contained in this class
     */
    public Medium(ArithmeticGame game) {
        this.game = game;
        r = new Random();
    }
    /**
     * random number to do thinkbrain with
     * @return int 1-50
     */
    public int getNum() {
        return r.nextInt(50) + 1;
    }
    /**
     * what to do with the numbers above
     * @return + - or *
     */
    public String getOperation() {
        switch (r.nextInt(3)) {
            case(0): return "+";
            case(1): return "-";
            case(2): return "*";
        }
        return null;
    }
    /**
     * sends you to next difficulty by changing state
     */
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("gamer mode activated");
    }
    /**
     * takes you back a difficulty because apparently this is too hard
     */
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("activating baby mode");
    }
}
