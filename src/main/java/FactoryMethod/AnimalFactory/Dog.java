package FactoryMethod.AnimalFactory;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("bark");
    }
}