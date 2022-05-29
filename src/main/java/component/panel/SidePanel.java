package component.panel;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {
    public SidePanel(){
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(new GridLayout());
        this.setAutoscrolls(true);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    }
}
