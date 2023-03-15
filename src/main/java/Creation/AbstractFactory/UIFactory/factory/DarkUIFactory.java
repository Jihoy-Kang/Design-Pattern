package Creation.AbstractFactory.UIFactory.factory;

import Creation.AbstractFactory.UIFactory.UIInterface.Button;
import Creation.AbstractFactory.UIFactory.UIInterface.CheckBox;
import Creation.AbstractFactory.UIFactory.UIInterface.ScrollBar;
import Creation.AbstractFactory.UIFactory.object.DarkButton;
import Creation.AbstractFactory.UIFactory.object.DarkCheckBox;
import Creation.AbstractFactory.UIFactory.object.DarkScrollBar;

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
