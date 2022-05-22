package frame.abstracts;

import component.frame.GFrame;
import component.other.GMenuBar;
import component.panel.NavigatorPanel;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractRFrame extends GFrame {
    public AbstractRFrame(String frameName) {
        super(frameName);
    }
    private final GMenuBar gMenuBar = new GMenuBar();
    @Override
    public void init() {
        this.gMenuBar.init();
        this.setJMenuBar(gMenuBar);
        this.postConstr();
        this.preDestroy();
        this.setVisible(true);
    }
}
