package Creation.AbstractFactory.UIFactory.object;

import Creation.AbstractFactory.UIFactory.UIInterface.CheckBox;

public class LightCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Light check");
    }
}
