package component.bar;

import trigger.abstracts.Initializer;
import trigger.abstracts.Loadable;

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
