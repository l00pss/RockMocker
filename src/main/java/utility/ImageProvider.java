package utility;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageProvider {
    public static Image getImage(String path){
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Image getImage(String path, Dimension dimension){
        try {
            Image image = ImageIO.read(new File(path));
            image = image.getScaledInstance(dimension.width,dimension.height,Image.SCALE_DEFAULT);
            return image;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
