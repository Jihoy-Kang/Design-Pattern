package Creation.AbstractFactory.UIFactory.factory;

import Creation.AbstractFactory.UIFactory.UIInterface.Button;
import Creation.AbstractFactory.UIFactory.UIInterface.CheckBox;
import Creation.AbstractFactory.UIFactory.UIInterface.ScrollBar;

public interface UIFactory {
    Button getButton();
    CheckBox getCheckBox();
    ScrollBar getScrollBar();
}
