package component.button;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public  class SideButton extends GButton{

    public SideButton(String buttonName){
        super(buttonName);
    }

    @Override
    public void paintComponents(Graphics g) {
        Graphics2D gx = (Graphics2D) g;
        gx.rotate(1, 50,100);
        super.paintComponents(gx);
    }
}
