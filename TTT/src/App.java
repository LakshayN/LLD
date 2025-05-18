public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        PlayerStrategy p1 = new HumanPlayerStrategy("Player X");
        PlayerStrategy p2 = new HumanPlayerStrategy("Player O");
        TicTacToeGame ttt = new TicTacToeGame(p1,p2);
        ttt.play();
    }
}



/*
TicTacToeGame -> Board, Player X, Player O, CurrentPlayer, GameContext(manage states)

Board -> row, col, Symbol[][] grid

Symbol enum -> X,O

Player -> Symbol, makeMove(Position pos, Symbol s)
Position -> row, col
PlayerStrategy -> humanPlayer, AiPlayer

GameContext -> GameState - inProgressState
                            XwonState
                            OwonState
                            DrawState

GameContext -> (makeMove, switchPlayer)

GameState interface -> GameState(void next(context), boolean isGameOver)
XTurnState
OTurnState
XWonState
OWonState
DrawState





*/