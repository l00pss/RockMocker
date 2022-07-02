package component.frame;

import trigger.abstracts.Loadable;
import trigger.abstracts.Initializer;

import javax.swing.*;
import java.awt.*;

public abstract class GFrame extends JFrame implements Initializer, Loadable {

    public GFrame(String frameName){
        this.setName(frameName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1400,1000));
        this.setLocationRelativeTo(null);
    }

}
