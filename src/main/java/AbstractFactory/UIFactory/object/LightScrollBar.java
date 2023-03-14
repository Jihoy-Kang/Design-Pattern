package AbstractFactory.UIFactory.object;

import AbstractFactory.UIFactory.UIInterface.ScrollBar;

public class LightScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Light Scroll");
    }
}
