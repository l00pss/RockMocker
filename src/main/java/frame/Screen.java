package frame;

import java.awt.*;

public enum Screen {
    CLIP {
        @Override
        public Dimension getDimension() {
            return new Dimension(500,200);
        }
    },MIDDLE{
        @Override
        public Dimension getDimension() {
            return new Dimension(this.dimension.width/2,this.dimension.height/2);
        }
    };
    final Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    public abstract Dimension getDimension();
}
