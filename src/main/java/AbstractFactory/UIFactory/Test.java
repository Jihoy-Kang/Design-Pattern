package AbstractFactory.UIFactory;

import AbstractFactory.UIFactory.UIInterface.Button;
import AbstractFactory.UIFactory.UIInterface.CheckBox;
import AbstractFactory.UIFactory.UIInterface.ScrollBar;
import AbstractFactory.UIFactory.factory.DarkUIFactory;
import AbstractFactory.UIFactory.factory.LightUIFactory;

public class Test {
    public static void main(String[] args) {
        DarkUIFactory darkUIFactory = new DarkUIFactory();
        LightUIFactory lightUIFactory = new LightUIFactory();

        Button button = darkUIFactory.getButton();
        CheckBox checkBox = darkUIFactory.getCheckBox();
        ScrollBar scrollBar = darkUIFactory.getScrollBar();

        button.click();
        checkBox.check();
        scrollBar.scroll();
    }
}
