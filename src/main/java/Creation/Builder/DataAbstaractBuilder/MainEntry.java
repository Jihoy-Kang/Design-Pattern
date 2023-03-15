package Creation.Builder.DataAbstaractBuilder;

public class MainEntry {
    public static void main(String[] args) {
        Data data = new Data("Jane", 25);

        Builder builder = new PlainTextBuilder(data);
        Director director = new Director(builder);
        String result = director.build();
        System.out.println(result);

        Builder jBuilder = new JsonBuilder(data);
        Director director1 = new Director(jBuilder);
        String result2 = director1.build();
        System.out.println(result2);

        Builder xBuilder = new XmlBuilder(data);
        Director director2 = new Director(xBuilder);
        String result3 = director2.build();
        System.out.println(result3);
    }
}
