package component.window;

import component.Loadable;
import component.Initializer;

import javax.swing.*;
import java.awt.*;

public abstract class GWindow extends JWindow implements Initializer, Loadable {
    public GWindow(){
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }
}
