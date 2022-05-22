package component.frame;

import com.formdev.flatlaf.FlatLaf;
import component.Loadable;
import component.factory.abstracts.AbstractLayoutFactory;
import component.factory.abstracts.FactoryManager;
import utility.Initializer;
import utility.view.ViewChanger;

import javax.swing.*;
import java.awt.*;

public abstract class GFrame extends JFrame implements Initializer, Loadable {

    public GFrame(String frameName){
        this.setName(frameName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);

    }

}
