package Creation.AbstractFactory.UIFactory.factory;

import Creation.AbstractFactory.UIFactory.UIInterface.Button;
import Creation.AbstractFactory.UIFactory.UIInterface.CheckBox;
import Creation.AbstractFactory.UIFactory.UIInterface.ScrollBar;
import Creation.AbstractFactory.UIFactory.object.LightButton;
import Creation.AbstractFactory.UIFactory.object.LightCheckBox;
import Creation.AbstractFactory.UIFactory.object.LightScrollBar;

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
