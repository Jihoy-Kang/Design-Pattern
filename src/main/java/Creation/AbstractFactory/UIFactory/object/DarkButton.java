package Creation.AbstractFactory.UIFactory.object;

import Creation.AbstractFactory.UIFactory.UIInterface.Button;

public class DarkButton implements Button {
    @Override
    public void click() {
        System.out.println("dark click");
    }
}
