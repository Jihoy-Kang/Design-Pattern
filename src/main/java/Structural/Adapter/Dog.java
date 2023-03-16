package Structural.Adapter;

public class Dog implements Animal{

    String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking");
    }
}
