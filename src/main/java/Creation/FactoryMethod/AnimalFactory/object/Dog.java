package Creation.FactoryMethod.AnimalFactory.object;

import Creation.FactoryMethod.AnimalFactory.AnimalInterface.Animal;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("bark");
    }
}
