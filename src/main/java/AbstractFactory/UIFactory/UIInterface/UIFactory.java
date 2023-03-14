package AbstractFactory.UIFactory.UIInterface;

import AbstractFactory.UIFactory.UIInterface.Button;
import AbstractFactory.UIFactory.UIInterface.CheckBox;
import AbstractFactory.UIFactory.UIInterface.ScrollBar;

public interface UIFactory {
    Button getButton();
    CheckBox getCheckBox();
    ScrollBar getScrollBar();
}
