import StateManagement.GameContext;
import StateManagement.OWonState;
import StateManagement.XWonState;

public class Board {
    public int row;
    public int col;
    public Symbol[][] grid;
    public GameContext context;

    public Board(int row, int col){
        this.row = row;
        this.col = col;
        grid = new Symbol[row][col];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void makeMove(Position pos, Symbol symbol){
        grid[pos.row][pos.col] = symbol;
    }

    public String getVal(Symbol sy){
        if(sy == Symbol.X){
            return "X";
        }
        if(sy == Symbol.O){
            return "O";
        }
        if(sy == Symbol.EMPTY){
            return "_";
        }
        return "";
    }

    public void printBoard(){
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(getVal(grid[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public void checkGameState(GameContext context){
        for (int i = 0; i < row; i++) {
            if (grid[i][0] != Symbol.EMPTY && isWinningLine(grid[i])) {
                if(grid[i][0] == Symbol.X){
                    context.setState(new XWonState());
                }
                else{
                    context.setState(new OWonState());
                }
                return;
            }
        }
        for (int i = 0; i < col; i++) {
            Symbol[] column = new Symbol[row];
            for (int j = 0; j < row; j++) {
                column[j] = grid[j][i];
            }
            if (column[0] != Symbol.EMPTY && isWinningLine(column)) {
                if(grid[i][0] == Symbol.X){
                    context.setState(new XWonState());
                }
                else{
                    context.setState(new OWonState());
                }
                return;
            }
        }

        Symbol[] diagonal1 = new Symbol[Math.min(row, col)];
        Symbol[] diagonal2 = new Symbol[Math.min(row, col)];
        for (int i = 0; i < Math.min(row, col); i++) {
        diagonal1[i] = grid[i][i];
        diagonal2[i] = grid[i][col - 1 - i];
        }
        if (diagonal1[0] != Symbol.EMPTY && isWinningLine(diagonal1)) {
            
            context.next();
            return;
        }
        if (diagonal2[0] != Symbol.EMPTY && isWinningLine(diagonal2)) {
        context.next();
        return;
        }
    }

    private boolean isWinningLine(Symbol[] line) {
        Symbol first = line[0];
        for (Symbol s : line) {
          if (s != first) {
            return false;
          }
        }
        return true;
      }


    public boolean isValidMove(Position pos){
        return true;
    }


}
