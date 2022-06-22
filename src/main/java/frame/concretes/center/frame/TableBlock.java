package frame.concretes.center.frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.stream.Stream;

public class TableBlock {


    private final String[] columnNames = { "ID", "Column Name", "Unique", "Nullable", "Updatable","Insertable","Type","Regex"};
    private  DefaultTableModel defaultTableModel = new DefaultTableModel();
    private final JTable mainTable = new JTable(defaultTableModel);


    public TableBlock(){
        Stream.of(this.columnNames).forEach(e->this.defaultTableModel.addColumn(e));
        this.mainTable.setSize(new Dimension(800,500));
        this.defaultTableModel.insertRow(0,new Object[]{""});
    }

    public JScrollPane getMainTable() {
        return new JScrollPane(this.mainTable);
    }
}
