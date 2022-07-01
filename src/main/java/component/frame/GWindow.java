package component.frame;

import java.awt.*;

public class GWindow extends Window {
    public GWindow(Frame owner) {
        super(owner);
    }

    public GWindow(Window owner) {
        super(owner);
    }

    public GWindow(Window owner, GraphicsConfiguration gc) {
        super(owner, gc);
    }
}
