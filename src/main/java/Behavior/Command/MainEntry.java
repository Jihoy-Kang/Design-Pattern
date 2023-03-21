package Behavior.Command;

public class MainEntry {
    public static void main(String[] args) {
        Command clearCmd = new ClearCommand();
        clearCmd.run();

        Command yellowCmd = new ColorCommand(ColorCommand.Color.Yellow);
        yellowCmd.run();

        Command moveCmd = new MoveCommand(10,1);
        moveCmd.run();

        Command printCmd = new PrintCommand("하이 디자인 패턴!!!");
        printCmd.run();

        Command moveCmd2 = new MoveCommand(15,5);
        moveCmd.run();

        printCmd.run();
    }
}
