package component.button;

import javax.swing.*;
import java.awt.*;

public class TransparantListButton extends JButton {
    public TransparantListButton(String name){
        super(name);
        this.setOpaque(false);
        this.setHorizontalAlignment(2);
        this.setPreferredSize(new Dimension(200,30));
    }

    public TransparantListButton(String name,ImageIcon icon){
        this(name);
    }
}
