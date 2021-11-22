import java.util.Random;
public class Medium implements State {
    private ArithmeticGame game;
    private Random r;

    public Medium(ArithmeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return r.nextInt(50) + 1;
    }

    public String getOperation() {
        switch (r.nextInt(2)) {
            case(0): return "+";
            case(1): return "-";
            case(2): return "*";
        }
        return null;
    }

    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("gamer mode activated");
    }

    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("activating baby mode");
    }
}
