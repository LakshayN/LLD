import StateManagement.GameContext;
import StateManagement.GameState;
import StateManagement.OWonState;
import StateManagement.XWonState;

public class TicTacToeGame {
    Board board;
    Player XPlayer;
    Player OPlayer;
    Player currentPlayer;
    GameContext context;

    public TicTacToeGame(PlayerStrategy p1, PlayerStrategy p2){
        this.board = new Board(3,3);
        this.XPlayer = new Player("Player X", p1);
        this.OPlayer = new Player("Player O", p2);
        this.currentPlayer = XPlayer;
        this.context = new GameContext();
    }

    public void play(){
        while(!context.isGameOver()){
            board.printBoard();
            Position pos = currentPlayer.makeMove(board);
            board.makeMove(pos, getSymbol());
            board.checkGameState(context);
            switchPlayer();
        }
        announceResult();
    }
    
    public Symbol getSymbol(){
        return (currentPlayer == XPlayer ? Symbol.X : Symbol.O);
    }
    public void switchPlayer(){
        if(currentPlayer == XPlayer){
            currentPlayer = OPlayer;
        }
        else{
            currentPlayer = XPlayer;
        }
    }
    public void announceResult(){
        GameState state = context.getState();
        if (state instanceof XWonState) {
            System.out.println("Player X wins!");
        } else if (state instanceof OWonState) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
