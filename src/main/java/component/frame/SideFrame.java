package component.frame;

import component.Loadable;
import component.Initializer;

import javax.swing.*;
import java.awt.*;

public abstract class SideFrame extends JFrame implements Initializer, Loadable {

    public SideFrame(String frameName){
        this.setName(frameName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(600,400));
    }

}
