package screens.concretes.west;

import trigger.abstracts.Loadable;
import component.panel.SidePanel;
import trigger.abstracts.Initializer;

import javax.swing.*;
import java.awt.*;

public class WestSidePanel extends SidePanel implements Initializer, Loadable {

    private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT,JTabbedPane.WRAP_TAB_LAYOUT);

    private final DatabasePanePanel databasePanePanel = new DatabasePanePanel();
    private final SchemaPanePanel schemaPanePanel = new SchemaPanePanel();
    private final TablePanePanel tablePanePanel = new TablePanePanel();
    {
        this.setBorder(BorderFactory.createLineBorder(Color.gray));
    }



    @Override
    public void postConstr() {
        this.tabbedPane.addTab("Database",new ImageIcon("src/main/java/component/icon/dbms.png"),databasePanePanel);
        this.tabbedPane.addTab("Schema",new ImageIcon("src/main/java/component/icon/schema.png"),schemaPanePanel);
        this.tabbedPane.addTab("Tables",new ImageIcon("src/main/java/component/icon/partitionForeignTable_dark.png"),tablePanePanel);
        this.databasePanePanel.init();
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
