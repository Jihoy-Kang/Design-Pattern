package AbstractFactory.UIFactory.object;

import AbstractFactory.UIFactory.UIInterface.CheckBox;

public class DarkCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Dark check");
    }
}
