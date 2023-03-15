package Creation.AbstractFactory.UIFactory.object;

import Creation.AbstractFactory.UIFactory.UIInterface.Button;

public class LightButton implements Button {
    @Override
    public void click() {
        System.out.println("Light click");
    }
}
