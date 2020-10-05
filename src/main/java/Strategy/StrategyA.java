package Strategy;

public class StrategyA implements StrategyForWin{
    @Override
    public void winTheGame() {
        System.out.println(" Using strategy A for winning the game");
    }
}
