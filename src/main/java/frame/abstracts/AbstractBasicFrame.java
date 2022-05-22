package frame.abstracts;

import component.frame.GFrame;

public abstract class AbstractBasicFrame extends GFrame {
    public AbstractBasicFrame(String frameName) {
        super(frameName);
    }

    @Override
    public void init() {
        this.postConstr();
        this.preDestroy();
        this.setVisible(true);
    }
}
