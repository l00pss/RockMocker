package frame.concretes.leftPanel;

import component.Loadable;
import component.button.SideButton;
import component.panel.SidePanel;
import utility.Initializer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LeftRPanel extends SidePanel implements Initializer, Loadable {

    private final JTabbedPane tabbedPane = new JTabbedPane();

    @Override
    public void postConstr() {
        this.tabbedPane.add(new DatabasePanePanel());
        this.tabbedPane.add(new SchemaPanePanel());
        this.tabbedPane.add(new TablePanePanel());
    }

    @Override
    public void preDestroy() {

    }

    @Override
    public void init() {
        this.postConstr();
    }
}
