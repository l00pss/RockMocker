package component.panel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PicPanel extends JPanel {
    private BufferedImage image;
    private int w,h;
    public PicPanel(String fname){
        this.setBackground(Color.black);
        try {
            image = ImageIO.read(new File(fname));
            w = image.getWidth();
            h = image.getHeight();
        } catch (IOException ioe) {
            System.out.println("Could not read in the pic");
            //System.exit(0);
        }

    }

    public Dimension getPreferredSize() {
        return new Dimension(w,h);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,0,0,this);
    }

}

