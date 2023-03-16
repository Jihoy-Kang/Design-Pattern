package Structural.Adapter;

import java.util.ArrayList;

public class mainEntry {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Cat("kitty"));
        animals.add(new Dog("choco"));
        animals.add(new FishAdapter(new Fish("nemo")));

        for(Animal animal : animals){
            animal.walk();
        }

    }
}
