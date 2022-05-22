package component.panel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TransparentPanel extends JPanel {
    public TransparentPanel(){
        this.setOpaque(false);
        this.setBorder(new EmptyBorder(10, 20, 10, 10));
    }

    public TransparentPanel(LayoutManager layoutManager){
        this();
        this.setLayout(layoutManager);
    }
}
