package Behavior.Strategy.Game;

public class MainEntry {
    public static void main(String[] args) {
        MoveAction action = new MoveAction();
        action.move(new Walk());
        action.move(new Run());
        action.move(new Fly());
    }

}
