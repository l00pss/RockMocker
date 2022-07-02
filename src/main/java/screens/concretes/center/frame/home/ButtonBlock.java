package screens.concretes.center.frame.home;

import component.button.BlueGButton;
import component.button.RedGButton;

import javax.swing.*;
import java.awt.*;

public class ButtonBlock {
    private final JPanel jPanel = new JPanel();

    private final JButton insertButton = new BlueGButton("Insert");
    private final JButton saveButton = new BlueGButton("Save");
    private final JButton detailsButton = new BlueGButton("Details");
    private final JButton deleteButton = new RedGButton("Delete");
    private final JButton clearButton = new BlueGButton("Clear");


    public ButtonBlock(){
        this.jPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.jPanel.add(insertButton);
        this.jPanel.add(saveButton);
        this.jPanel.add(detailsButton);
        this.jPanel.add(deleteButton);
        this.jPanel.add(clearButton);
    }

    public JPanel getButtonPanel() {
        return jPanel;
    }
}
