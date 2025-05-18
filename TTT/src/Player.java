public class Player {
    PlayerStrategy strategy;
    String name;

    public Player(String name, PlayerStrategy strat){
        this.name = name;
        this.strategy = strat;
    }

    public Position makeMove(Board board){
        return strategy.makeMove(board);
    }
}
