package component.table;

import javax.swing.table.DefaultTableCellRenderer;
import java.text.DateFormat;

public class GDataRenderer extends DefaultTableCellRenderer {
    DateFormat formatter;
    public GDataRenderer() { super(); }

    public void setValue(Object value) {
        if (formatter==null) {
            formatter = DateFormat.getDateInstance();
        }
        setText((value == null) ? "" : formatter.format(value));
    }
}
