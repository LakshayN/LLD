package StateManagement;

public interface GameState {
    void nextState(GameContext context);
    boolean isGameOver();
}
