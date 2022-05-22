package frame.concretes;

import frame.abstracts.AbstractBasicFrame;
import frame.abstracts.AbstractRFrame;

import java.awt.*;

public class SplashFrame extends AbstractBasicFrame {
    public SplashFrame(String frameName) {
        super(frameName);
        this.setSize(800,400);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.CYAN);
    }

    @Override
    public void postConstr() {

    }

    @Override
    public void preDestroy() {

    }
}
