package frame.concretes;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import component.factory.abstracts.AbstractLayoutFactory;
import component.factory.abstracts.FactoryManager;
import component.other.GMenuBar;
import frame.abstracts.AbstractRFrame;
import utility.Initializer;
import utility.view.ViewChanger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MainRFrame extends AbstractRFrame  {
    private final FlatLaf flatLightLaf = ViewChanger.DARK.get();
    public final AbstractLayoutFactory layerFactory = (AbstractLayoutFactory) FactoryManager.LAYOUT.get();

    private final MainBlockFrame mainBlockFrame = new MainBlockFrame();

    public MainRFrame(String frameName) {
        super(frameName);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        this.add(mainBlockFrame,BorderLayout.CENTER);
    }


    @Override
    public void postConstr() {
        this.initUI();
        this.mainBlockFrame.init();
    }

    @Override
    public void preDestroy() {

    }

    private void initUI(){
        try {
            this.setIconImage(ImageIO.read(new File("src/main/java/component/icon/M.png")));
        } catch (IOException  e) {
            JOptionPane.showMessageDialog(new JFrame("Error"),"Init Application Icon exception");
        }
    }

}
