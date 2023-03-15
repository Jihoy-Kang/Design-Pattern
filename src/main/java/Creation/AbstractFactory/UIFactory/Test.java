package Creation.AbstractFactory.UIFactory;

import Creation.AbstractFactory.UIFactory.UIInterface.Button;
import Creation.AbstractFactory.UIFactory.UIInterface.CheckBox;
import Creation.AbstractFactory.UIFactory.UIInterface.ScrollBar;
import Creation.AbstractFactory.UIFactory.factory.DarkUIFactory;
import Creation.AbstractFactory.UIFactory.factory.LightUIFactory;

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
