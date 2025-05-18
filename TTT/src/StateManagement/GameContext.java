package StateManagement;

public class GameContext {
    GameState currentState;

    public GameContext(){
        this.currentState = new XTurnState();
    }
    
    public void next(){
        currentState.nextState(this);
    }
    public boolean isGameOver(){
        return currentState.isGameOver();
    }

    public void setState(GameState state){
        this.currentState = state;
    }
    public GameState getState(){
        return currentState;
    }
}
