package Creation.Singleton;

public class mainEntry {
    public static void main(String[] args) {
        King king = King.getInstance();
        king.say();
    }
}
