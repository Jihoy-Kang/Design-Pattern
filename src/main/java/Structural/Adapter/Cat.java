package Structural.Adapter;

public class Cat implements Animal{

    String name;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking");
    }
}
