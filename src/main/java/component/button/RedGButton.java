package component.button;

import java.awt.*;

public class RedGButton extends GButton{
    public RedGButton(String name){
        super(name);
        this.setBackground(Color.decode("#2980b9"));
        this.setForeground(Color.white);
    }
}
