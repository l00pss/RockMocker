package frame.concretes.leftPanel;

import component.Loadable;
import component.button.TransparantListButton;
import component.panel.ComponentPanel;
import utility.Initializer;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class DatabasePanePanel extends ComponentPanel implements Initializer, Loadable {
    private final DefaultListModel<Button> defaultListModel = new DefaultListModel<>();
    private JList<Button> list = new JList<>(defaultListModel);
    private final JScrollPane scrollPane ;
    Box box = Box.createVerticalBox();
    public DatabasePanePanel(){
        super();
        this.defaultListModel.addElement(new Button("Oracle"));
        this.defaultListModel.addElement(new Button("PostgreSQL"));
        this.defaultListModel.addElement(new Button("MySQL"));
        this.list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane = new JScrollPane(list);
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
