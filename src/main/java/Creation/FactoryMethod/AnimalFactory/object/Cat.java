package Creation.FactoryMethod.AnimalFactory.object;

import Creation.FactoryMethod.AnimalFactory.AnimalInterface.Animal;

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("meow");
    }
}
