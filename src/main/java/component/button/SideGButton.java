package component.button;

import java.awt.*;

public  class SideGButton extends GButton{

    public SideGButton(String buttonName){
        super(buttonName);
    }

    @Override
    public void paintComponents(Graphics g) {
        Graphics2D gx = (Graphics2D) g;
        gx.rotate(1, 50,100);
        super.paintComponents(gx);
    }
}
