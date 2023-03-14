package AbstractFactory.UIFactory.factory;

import AbstractFactory.UIFactory.UIInterface.Button;
import AbstractFactory.UIFactory.UIInterface.CheckBox;
import AbstractFactory.UIFactory.UIInterface.ScrollBar;
import AbstractFactory.UIFactory.UIInterface.UIFactory;
import AbstractFactory.UIFactory.object.DarkButton;
import AbstractFactory.UIFactory.object.DarkCheckBox;
import AbstractFactory.UIFactory.object.DarkScrollBar;

public class DarkUIFactory implements UIFactory {
    @Override
    public Button getButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new DarkCheckBox();
    }

    @Override
    public ScrollBar getScrollBar() {
        return new DarkScrollBar();
    }
}
