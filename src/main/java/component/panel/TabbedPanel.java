package component.panel;

import component.Loadable;
import utility.Initializer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.stream.Stream;

public class TabbedPanel extends JPanel implements Initializer, Loadable {


    private String[] columnNames = { "ID", "Column Name", "Unique", "Nullable", "Updatable","Insertable","Type","Regex"};
    private DefaultTableModel defaultTableModel = new DefaultTableModel();
    private final JTable mainTable = new JTable(defaultTableModel);
    public TabbedPanel(){
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        Stream.of(this.columnNames).forEach(e->this.defaultTableModel.addColumn(e));
        this.mainTable.setSize(new Dimension(800,500));
        this.add(new JScrollPane(this.mainTable));
        this.defaultTableModel.insertRow(0,new Object[]{""});
    }


    @Override
    public void postConstr() {

    }

    @Override
    public void preDestroy() {

    }

    @Override
    public void init() {

    }
}
