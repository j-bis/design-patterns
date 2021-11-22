import java.util.Random;
;public class Easy implements State {
    private ArithmeticGame game;
    private Random r;

    public Easy(ArithmeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return r.nextInt(10) + 1;
    }

    public String getOperation() {
        if (r.nextInt(2) != 0) {
            return "+";
        }
        return "-";
    }

    public void levelUp() {
        game.setState(game.getMediumState());
        System.out.println("ok ok i see you");
    }

    public void levelDown() {
        System.out.println("youre bad");
    }
}
