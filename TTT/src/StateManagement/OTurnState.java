package StateManagement;

public class OTurnState implements GameState {
    @Override
    public void nextState(GameContext context){
        context.setState(new XTurnState());
    }
    @Override
    public boolean isGameOver(){
        return false;
    }
}
