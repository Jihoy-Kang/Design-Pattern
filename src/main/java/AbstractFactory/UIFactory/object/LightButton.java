package AbstractFactory.UIFactory.object;

import AbstractFactory.UIFactory.UIInterface.Button;

public class LightButton implements Button {
    @Override
    public void click() {
        System.out.println("Light click");
    }
}
