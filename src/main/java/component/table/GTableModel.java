package component.table;

import javax.swing.table.AbstractTableModel;
import java.util.Objects;

public class GTableModel extends AbstractTableModel {
    private static final String[] COLUMNS = { "ID", "Column Name", "Unique", "Nullable", "Updatable","Insertable","Type","Regex"};
    private Object[][] data = new Object[][]{{"","","","","","","",""}};

    public int getColumnCount() {
        return COLUMNS.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return COLUMNS[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}
