package screens.concretes.west;

import trigger.abstracts.Loadable;
import component.renderer.PanelRenderer;
import component.button.GlueListButton;
import component.panel.ComponentPanel;
import trigger.abstracts.Initializer;

import javax.swing.*;
import java.awt.*;

public class DatabasePanePanel extends ComponentPanel implements Initializer, Loadable {
    private final DefaultListModel<JButton> defaultListModel = new DefaultListModel<>();

    private final JButton oracleButton = new GlueListButton("Oracle");
    private final JButton postgresButton = new GlueListButton("PostgresSql");
    private final JButton mySqlButton = new GlueListButton("MySQL");
    private final JList<JButton> list ;
    private final JScrollPane scrollPane ;
    Box box = Box.createVerticalBox();
    public DatabasePanePanel(){
        super();
        this.defaultListModel.addElement(this.oracleButton);
        this.defaultListModel.addElement(this.postgresButton);
        this.defaultListModel.addElement(this.mySqlButton);
        this.list = new JList<>(defaultListModel);
        this.list.setCellRenderer(new PanelRenderer());
        this.list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane = new JScrollPane(list);
        final JScrollBar scrollBar = scrollPane.getVerticalScrollBar();
    }



    @Override
    public void postConstr() {
        this.add(this.scrollPane,BorderLayout.CENTER);
    }

    @Override
    public void preDestroy() {

    }

    @Override
    public void init() {
        this.postConstr();
        this.preDestroy();
    }
}
