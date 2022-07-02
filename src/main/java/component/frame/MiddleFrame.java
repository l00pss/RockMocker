package component.frame;

import frame.Screen;

import javax.swing.*;

public class MiddleFrame extends ClipFrame {
    public MiddleFrame(String name){
        super(name);
        this.setMinimumSize(Screen.MIDDLE.getDimension());
    }
}
