package frame.abstracts;

import component.frame.GFrame;
import component.window.GWindow;

public abstract class AbstractRWindow extends GWindow {
    public AbstractRWindow() {
    }

    @Override
    public void init() {
        this.postConstr();
        this.preDestroy();
        this.setVisible(true);
    }
}
