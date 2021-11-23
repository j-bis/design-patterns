import java.util.Random;
/**
 * hard state of the game
 */
public class Hard implements State {
    private Random r;
    private ArithmeticGame game;
    /**
     * constructor for difficulty level
     * @param game game being played contained in this class
     */
    public Hard(ArithmeticGame game) {
        this.game = game;
        r = new Random();
    }
    /**
     * random number to do compute with a calculator
     * @return int 1-100
     */
    public int getNum() {
        return r.nextInt(100) + 1;
    }
    /**
     * operation to perform with earlier called random numbers
     * @return + - * or /
     */
    public String getOperation() {
        switch (r.nextInt(4)) {
            case(0): return "+";
            case(1): return "-";
            case(2): return "*";
            case(3): return "/";
        }
        return null;
    }
    /**
     * level limit reached so no more harder
     */
    public void levelUp() {
        System.out.println("ENGINEER GAMING");

    }
    /**
     * takes you back a difficulty because apparently this is too hard
     */
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("ya couldnt handle the neutron style");
    }
}
