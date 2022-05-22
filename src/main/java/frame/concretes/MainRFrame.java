package frame.concretes;

import com.formdev.flatlaf.FlatLaf;
import component.factory.abstracts.AbstractLayoutFactory;
import component.factory.abstracts.FactoryManager;
import component.other.GMenuBar;
import frame.abstracts.AbstractRFrame;
import utility.Initializer;
import utility.view.ViewChanger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class MainRFrame extends AbstractRFrame  {
    private final FlatLaf flatLightLaf = ViewChanger.DARK.get();

    public final AbstractLayoutFactory layerFactory = (AbstractLayoutFactory) FactoryManager.LAYOUT.get();

    public MainRFrame(String frameName) {
        super(frameName);
    }


    @Override
    public void postConstr() {
        try {
            UIManager.setLookAndFeel (flatLightLaf);
            this.setIconImage(ImageIO.read(new File("src/main/java/component/icon/M.png")));
        } catch (IOException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(new JFrame("Error"),"Init Application Icon exception");
        }
        this.setLayout(layerFactory.factoryBorderLayout());
    }

    @Override
    public void preDestroy() {

    }
}
