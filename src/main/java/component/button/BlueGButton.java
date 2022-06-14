package component.button;

import javax.swing.*;
import java.awt.*;

public class BlueGButton extends GButton{
    public BlueGButton(String name){
        super(name);
        this.setBackground(Color.decode("#318ff2"));
        this.setForeground(Color.white);

    }
}
