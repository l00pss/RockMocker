package component.button;

import javax.swing.*;

public class TransparantListButton extends JButton {
    public TransparantListButton(String name){
        super(name);
//        this.setOpaque(false);
//        this.setContentAreaFilled(false);
//        this.setBorderPainted(false);
    }

    public TransparantListButton(String name,ImageIcon icon){
        this(name);
    }
}
