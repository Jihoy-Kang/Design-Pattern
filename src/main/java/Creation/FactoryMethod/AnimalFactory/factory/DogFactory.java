package Creation.FactoryMethod.AnimalFactory.factory;

import Creation.FactoryMethod.AnimalFactory.object.Dog;

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
