package Behavior.Strategy.Game;

public class Walk implements MoveStrategy {
    @Override
    public String move() {
        return "걷기";
    }
}
