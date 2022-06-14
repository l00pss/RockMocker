package frame.concretes.leftPanel;

import component.Loadable;
import component.button.SideButton;
import component.panel.SidePanel;
import utility.Initializer;

import javax.swing.*;
import javax.swing.plaf.LabelUI;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LeftRPanel extends SidePanel implements Initializer, Loadable {

    private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);

    {
        this.setBorder(BorderFactory.createLineBorder(Color.gray));
    }
    @Override
    public void postConstr() {
        this.tabbedPane.addTab("Database",new ImageIcon("src/main/java/component/icon/dbms.png"),new DatabasePanePanel());
        this.tabbedPane.addTab("Schema",new ImageIcon("src/main/java/component/icon/schema.png"),new SchemaPanePanel());
        this.tabbedPane.addTab("Tables",new ImageIcon("src/main/java/component/icon/partitionForeignTable_dark.png"),new TablePanePanel());

    }

    @Override
    public void preDestroy() {
        this.add(this.tabbedPane);
    }

    @Override
    public void init() {
        this.postConstr();
        this.preDestroy();
    }
}
