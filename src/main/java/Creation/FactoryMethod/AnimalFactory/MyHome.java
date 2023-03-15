package Creation.FactoryMethod.AnimalFactory;

import Creation.FactoryMethod.AnimalFactory.factory.CatFactory;
import Creation.FactoryMethod.AnimalFactory.factory.DogFactory;
import Creation.FactoryMethod.AnimalFactory.object.Cat;
import Creation.FactoryMethod.AnimalFactory.object.Dog;

public class MyHome {

    public static void main(String[] args) {

        CatFactory catFactory = new CatFactory(); // 초기화
        DogFactory dogFactory = new DogFactory(); // 초기화

        Cat neo = catFactory.createAnimal(); // 고양이 생성 from catFactroy
        catFactory.addWings(neo); // 고양이 날개 달기 from catFactory
        neo.speak(); // 고양이 울음 form Cat

        Dog puppy = dogFactory.createAnimal();
        dogFactory.addWings(puppy);
        puppy.speak();


    }
}
