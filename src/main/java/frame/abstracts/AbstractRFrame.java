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
    private final NavigatorPanel navigatorPanel = new NavigatorPanel();
    @Override
    public void init() {
        this.gMenuBar.init();
        this.navigatorPanel.init();
        this.setJMenuBar(gMenuBar);
        this.add(navigatorPanel, BorderLayout.NORTH);
        this.postConstr();
        this.preDestroy();
        this.setVisible(true);
    }
}
