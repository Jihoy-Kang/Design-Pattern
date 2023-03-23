package Behavior.Memento;

import java.util.ArrayList;
import java.util.Map;

public class Walker {
    private int currentX, currentY;
    private int targetX, targetY;
    private ArrayList<String> actionList = new ArrayList<>();

    public Walker(int currentX, int currentY, int targetX, int targetY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.targetX = targetX;
        this.targetY = targetY;
    }

    public double walk(String action){
        actionList.add(action);

        if(action.equalsIgnoreCase("up")){
            currentY += 1;
        }else if(action.equalsIgnoreCase("right")){
            currentX += 1;
        }else if(action.equalsIgnoreCase("down")){
            currentY -= 1;
        }else if(action.equalsIgnoreCase("left")){
            currentX -= 1;
        }

        return Math.sqrt(Math.pow(currentX-targetX,2)+Math.pow(currentY-targetY,2));
    }

    public class Memento {
        private int x, y;
        private ArrayList<String> actionList;
        private  Memento(){};
    }

    public Memento createMemento(){
        Memento memento = new Memento();

        memento.x = this.currentX;
        memento.y = this.currentY;
        memento.actionList = (ArrayList<String>) this.actionList.clone();

        return memento;
    }

    public void restoreMemento(Memento memento){
        this.currentX = memento.x;
        this.currentY = memento.y;
        this.actionList = (ArrayList<String>) memento.actionList.clone();
    }

    @Override
    public String toString() {
        return actionList.toString();
    }
}
