package frame.concretes.center.frame.home;

import component.table.GDataRenderer;
import component.table.GTableModel;
import model.entity.table.Table;
import service.abstracts.AbstractMemento;
import service.concretes.Memento;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableBlock  implements TableModelListener {

    private final GTableModel gTableModel = new GTableModel();
    private final JTable mainTable;

    private  Table table = new Table();

    private final AbstractMemento<Table> memento;

    public TableBlock(){
        this.mainTable = new JTable(this.gTableModel);
        this.mainTable.getModel().addTableModelListener(this);
        this.memento = new Memento<>(this.table);
    }

    public JScrollPane getMainTable() {
        return new JScrollPane(this.mainTable);
    }

    void setState(Table table){
        this.memento.push(table);
    }

    void undo(){
        this.setState(this.memento.undo());
    }

    void redo(){
        this.setState(this.memento.redo());
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
    }
}
