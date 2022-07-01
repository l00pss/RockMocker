package component.frame;

import component.Loadable;
import component.Initializer;

import javax.swing.*;
import java.awt.*;

public abstract class GFrame extends JFrame implements Initializer, Loadable {

    public GFrame(String frameName){
        this.setName(frameName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(1400,1000));
    }

}
