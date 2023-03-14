package AbstractFactory.UIFactory.object;

import AbstractFactory.UIFactory.UIInterface.Button;

public class DarkButton implements Button {
    @Override
    public void click() {
        System.out.println("dark click");
    }
}
