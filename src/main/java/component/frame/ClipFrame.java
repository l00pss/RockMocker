package component.frame;

import component.Initializer;
import component.Loadable;

import javax.swing.*;

public class ClipFrame extends JFrame implements Initializer, Loadable {
    public ClipFrame(String name){
        super(name);
    }

    @Override
    public void init() {
        postConstr();
        preDestroy();
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }

}
