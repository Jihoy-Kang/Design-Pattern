package Creation.AbstractFactory.UIFactory.object;

import Creation.AbstractFactory.UIFactory.UIInterface.ScrollBar;

public class DarkScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Dark Scroll");
    }
}
