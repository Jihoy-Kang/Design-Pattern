package Behavior.Command;

public class ColorCommand implements Command{
    public enum Color {
        Black("\u001B[30m"), Red("\u001B[31m"),
        Green("\u001B[32m"), Yellow("\u001B[33m"),
        Blue("\u001B[34m"), Purple("\u001B[35m"),
        Cyan("\u001B[36m"), White("\u001B[37m");

        final private String code;

        private Color(String code) {
            this.code = code;
        }

        public String getCode(){
            return code;
        }
    };

    private Color color;

    public ColorCommand(Color color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(color.getCode());
    }
}
