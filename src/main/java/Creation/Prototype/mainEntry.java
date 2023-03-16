package Creation.Prototype;

public class mainEntry {
    public static void main(String[] args) {
        BlackCat blackCat = new BlackCat();
        System.out.println(blackCat.toString());

        BlackCat whiteCat = (BlackCat) blackCat.copy();
        whiteCat.setBody("white");
        whiteCat.setEye("white");
        whiteCat.setTail("white");
        System.out.println(whiteCat.toString());
    }
}
