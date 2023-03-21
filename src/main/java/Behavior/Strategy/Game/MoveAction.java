package Behavior.Strategy.Game;

public class  MoveAction {
    void move(MoveStrategy strategy) {
        System.out.println("캐릭터가 " + strategy.move() + " 시작 합니다.");
    }
}
