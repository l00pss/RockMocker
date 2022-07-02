package screens.abstracts;

import component.window.GWindow;

import java.awt.*;

public abstract class AbstractRWindow extends GWindow {
    public AbstractRWindow() {
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    @Override
    public void init() {
        this.postConstr();
        this.preDestroy();
        this.setVisible(true);
    }
}
