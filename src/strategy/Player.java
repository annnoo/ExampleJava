package strategy;

public class Player {

    IStrategy strategy;

    int leben = 100;



    public Player(IStrategy strat){
        strategy = strat;
    }

    public void onEnemy(){
        strategy.execute();
    }
}
