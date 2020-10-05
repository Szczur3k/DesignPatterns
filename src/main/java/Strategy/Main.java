package Strategy;

public class Main {
    public static void main(String[] args) {

        Game game1 = new Game(new StrategyA());
        Game game2 = new Game(new StrategyB());
        Game game3 = new Game(new StrategyC());

        game1.winningTheGame("Fernando The Riviera");
        game2.winningTheGame("Fernando The Riviera");
        game3.winningTheGame("Fernando The Riviera");

    }
}
