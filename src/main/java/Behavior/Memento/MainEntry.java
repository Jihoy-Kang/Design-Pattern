package Behavior.Memento;

import java.util.Random;

public class MainEntry {
    public static void main(String[] args) {
        Walker  walker = new Walker(0,0,3,3);
        String[] actions = {"up","down","left","right"};
        Random random = new Random();
        double minDistance = Double.MAX_VALUE;
        Walker.Memento memento = null;

        while (true){
            String action = actions[random.nextInt(4)];
            double distance = walker.walk(action);
            System.out.println(action + " "+ distance);

            if(distance == 0.0){
                break;
            }

            if(minDistance > distance){
                memento = walker.createMemento();
            } else {
                walker.restoreMemento(memento);
            }
        }


        System.out.println("Walker;s path : " + walker);

    }
}
