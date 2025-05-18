package StateManagement;

public class XTurnState implements GameState {
    @Override
    public void nextState(GameContext context){
        context.setState(new OTurnState());
    }
    @Override
    public boolean isGameOver(){
        return false;
    }
}
