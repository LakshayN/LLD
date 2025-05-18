package StateManagement;

public class XWonState implements GameState {
    @Override
    public void nextState(GameContext context){
        // game over, no next move
    }
    @Override
    public boolean isGameOver(){
        return true;
    }
}
