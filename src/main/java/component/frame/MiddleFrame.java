package component.frame;

import screens.Screen;

public class MiddleFrame extends ClipFrame {
    public MiddleFrame(String name){
        super(name);
        this.setMinimumSize(Screen.MIDDLE.getDimension());
    }
}
