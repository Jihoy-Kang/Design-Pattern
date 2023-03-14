package AbstractFactory.UIFactory.factory;

import AbstractFactory.UIFactory.UIInterface.Button;
import AbstractFactory.UIFactory.UIInterface.CheckBox;
import AbstractFactory.UIFactory.UIInterface.ScrollBar;
import AbstractFactory.UIFactory.UIInterface.UIFactory;
import AbstractFactory.UIFactory.object.LightButton;
import AbstractFactory.UIFactory.object.LightCheckBox;
import AbstractFactory.UIFactory.object.LightScrollBar;

public class LightUIFactory implements UIFactory {
    @Override
    public Button getButton() {
        return new LightButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new LightCheckBox();
    }

    @Override
    public ScrollBar getScrollBar() {
        return new LightScrollBar();
    }
}
