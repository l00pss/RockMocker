package component.frame;

import screens.Screen;

import javax.swing.*;
import java.awt.geom.RoundRectangle2D;

public class SmallFrame extends ClipFrame {
    public SmallFrame(String name){
        super(name);
        this.setMinimumSize(Screen.CLIP.getDimension());
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        this.setShape(new RoundRectangle2D.Double(0, 0, 300, 120, 50, 50));
    }
}