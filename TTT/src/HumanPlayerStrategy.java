
import java.util.*;

public class HumanPlayerStrategy implements PlayerStrategy {
    Scanner scanner;
    String playerName;
    
    public HumanPlayerStrategy(String playerName){
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board){
        while(true){
            System.out.println("Make your move");
            try{
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                Position move = new Position(row, col);
    
                if(board.isValidMove(move)){
                    return move;
                }
                System.out.println("invalid move. Try again!! ");
            }
            catch(Exception e){
                System.out.println("Invalid input. Please enter row and column as numbers.");
                scanner.nextLine();
            }
        }
    }
}
