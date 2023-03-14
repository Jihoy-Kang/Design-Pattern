package FactoryMethod.AnimalFactory;

public class CatFactory implements CreateFactory {
    @Override
    public Cat createAnimal() {
        return new Cat();
    }

    public Cat addWings(Cat cat){
        System.out.println("wing added");
        return cat;
    }
}

