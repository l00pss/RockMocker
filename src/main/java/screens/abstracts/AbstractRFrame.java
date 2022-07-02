package screens.abstracts;

import component.frame.GFrame;
import screens.concretes.MenuBar;

public abstract class AbstractRFrame extends GFrame {
    public AbstractRFrame(String frameName) {
        super(frameName);
    }
    private final MenuBar menuBar = new MenuBar();
    @Override
    public void init() {
        this.menuBar.init();
        this.setJMenuBar(menuBar);
        this.postConstr();
        this.preDestroy();
        this.setVisible(true);
    }
}
