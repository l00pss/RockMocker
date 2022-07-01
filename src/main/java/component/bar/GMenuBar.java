package component.bar;

import component.Initializer;
import component.Loadable;

import javax.swing.*;

public abstract class GMenuBar extends JMenuBar implements Initializer, Loadable {
    public GMenuBar(){
        super();
    }

    @Override
    public JMenu add(JMenu c) {
        return super.add(c);
    }


}
