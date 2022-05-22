package frame.concretes;

import component.panel.PicPanel;
import frame.abstracts.AbstractRWindow;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SplashFrame extends AbstractRWindow {
    private final PicPanel jPanel = new PicPanel("src/main/java/component/icon/M.png");
    private final JLabel imageLabel = new JLabel();
    public SplashFrame() {

    }

    @Override
    public void postConstr() {
        this.jPanel.add(this.imageLabel,BorderLayout.CENTER);
        this.jPanel.setBackground(Color.black);
        this.add(this.jPanel);
    }

    @Override
    public void preDestroy() {
        this.setShape(new RoundRectangle2D.Double(0, 0, 1000, 500, 50, 50));
    }
}
