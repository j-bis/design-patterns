import java.util.Random;
public class Hard implements State {
    private Random r;
    private ArithmeticGame game;
    
    public Hard(ArithmeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return r.nextInt(100) + 1;
    }

    public String getOperation() {
        switch (r.nextInt(3)) {
            case(0): return "+";
            case(1): return "-";
            case(2): return "*";
            case(3): return "/";
        }
        return null;
    }

    public void levelUp() {
        System.out.println("ENGINEER GAMING");

    }

    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("ya couldnt handle the neutron style");
    }
}
