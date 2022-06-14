package component.panel;

import javax.swing.*;
import java.awt.*;

public class ComponentPanel extends JPanel {

    private JMenuBar jMenuBar = new JMenuBar();
    private JPanel menuBarPanel = new JPanel();
    private FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);


    {
        this.setLayout(new GridLayout());
        this.menuBarPanel.setLayout(this.flowLayout);
        this.jMenuBar.add(new JSeparator());
        this.jMenuBar.add(new JButton(new ImageIcon("src/main/java/component/icon/removeSlot_dark.png")));
        this.jMenuBar.add(new JButton(new ImageIcon("src/main/java/component/icon/cancel_dark.png")));
        this.menuBarPanel.add(this.jMenuBar);
        this.add(this.menuBarPanel);
    }
}
