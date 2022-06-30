package component;

import javax.swing.*;
import java.awt.*;

public class PanelRenderer implements ListCellRenderer {

    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JButton renderer = (JButton) value;
        renderer.setBackground(isSelected ? Color.gray : list.getBackground());
        return renderer;
    }
}