package Structural.Adapter;

public class Fish { //implements Animal {

    String name;
    public Fish(String name) {
        this.name = name;
    }

//    @Override
//    public void walk() {
//        System.out.println("fish can not walk");
//    }

    public void swim() {
        System.out.println(name + " is swimming");
    }
}
