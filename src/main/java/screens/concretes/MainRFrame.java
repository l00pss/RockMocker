package screens.concretes;

import com.formdev.flatlaf.FlatLaf;
import component.factory.abstracts.AbstractLayoutFactory;
import component.factory.abstracts.FactoryManager;
import screens.abstracts.AbstractRFrame;
import screens.concretes.center.MainBlockFrame;
import screens.concretes.west.WestSidePanel;
import screens.concretes.east.EastSidePanel;
import utility.view.ViewChanger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MainRFrame extends AbstractRFrame  {
    private final FlatLaf flatLightLaf = ViewChanger.DARK.get();
    public final AbstractLayoutFactory layerFactory = (AbstractLayoutFactory) FactoryManager.LAYOUT.get();



    private final EastSidePanel eastSidePanel = new EastSidePanel();
    private final MainBlockFrame mainBlockFrame = new MainBlockFrame();
    private final WestSidePanel westSidePanel = new WestSidePanel();

    public MainRFrame(String frameName) {
        super(frameName);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        this.add(westSidePanel,BorderLayout.WEST);
        this.add(mainBlockFrame,BorderLayout.CENTER);
        this.add(eastSidePanel,BorderLayout.EAST);
    }


    @Override
    public void postConstr() {
        this.initUI();
        this.mainBlockFrame.init();
        this.initSidePanel();
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


    private void initSidePanel(){
        this.westSidePanel.init();
        this.eastSidePanel.init();
    }

}
