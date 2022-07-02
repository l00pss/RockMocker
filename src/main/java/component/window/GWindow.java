package component.window;

import component.Loadable;
import component.Initializer;

import javax.swing.*;
import java.awt.*;

public abstract class GWindow extends JWindow implements Initializer, Loadable {
    private JFrame mainFrame;
    public GWindow(){
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.pack();
    }

    public GWindow(Frame frame){
        super(frame);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    @Override
    public void init() {
        postConstr();
        preDestroy();
        this.setVisible(true);
    }

    public void setMainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }
}
