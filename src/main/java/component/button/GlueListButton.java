package component.button;

import javax.swing.*;
import java.awt.*;

public class GlueListButton extends GButton {
    public GlueListButton(String name){
        super(name);
        this.setOpaque(false);
        this.setHorizontalAlignment(2);
        this.setPreferredSize(new Dimension(200,30));
    }

    public GlueListButton(String name, ImageIcon icon){
        this(name);
    }
}
