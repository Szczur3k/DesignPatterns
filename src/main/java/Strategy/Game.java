package Strategy;

public class Game {
    private StrategyForWin strategyForWin;

    public Game(StrategyForWin strategyForWin){
        this.strategyForWin = strategyForWin;
    }

    public void setStrategyForWin(StrategyForWin strategyForWin){
        this.strategyForWin = strategyForWin;
    }

    public void winningTheGame(String player){
        System.out.print(player);
        strategyForWin.winTheGame();
    }

}
