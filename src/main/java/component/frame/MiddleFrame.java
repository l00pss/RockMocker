package component.frame;

import frame.Screen;

import javax.swing.*;

public class MiddleFrame extends JFrame {
    public MiddleFrame(String name){
        super(name);
        this.setMinimumSize(Screen.MIDDLE.getDimension());
        this.setLocationRelativeTo(null);
        this.pack();
    }
}
