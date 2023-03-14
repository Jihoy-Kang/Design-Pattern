package FactoryMethod.AnimalFactory;

public class DogFactory implements CreateFactory {
    @Override
    public Dog createAnimal() {
        return new Dog();
    }

    public Dog addWings(Dog dog){
        System.out.println("wing added");
        return dog;
    }
}
