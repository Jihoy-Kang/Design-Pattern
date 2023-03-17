package Structural.Decorator;

public class mainEntry {
    public static void main(String[] args) {
        Strings strings = new Strings();
        strings.add("asdfwe");
        strings.add("asdfloba");
        strings.add("asdfasdf");
        strings.add("abcdefgasdfl;kj");

        //strings.print();

        Item decorator = new SideDecorator(strings, '\"');
        decorator.print();

        Item decorator2 = new LineNumberDecorator(strings);
        decorator2.print();

        Item decorator3 = new BoxDecorator(decorator);
        decorator3.print();
    }
}
