package component.frame;

import frame.Screen;

import javax.swing.*;

public class SmallFrame extends ClipFrame {
    public SmallFrame(String name){
        super(name);
        this.setMinimumSize(Screen.CLIP.getDimension());
    }
}