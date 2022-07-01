package frame.concretes.center;

import component.Loadable;
import component.factory.abstracts.AbstractLayoutFactory;
import component.factory.abstracts.FactoryManager;
import frame.concretes.center.frame.TabbedFramePanel;
import utility.ImageProvider;
import component.Initializer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainBlockFrame extends JPanel implements Initializer, Loadable {
    private final List<TabbedFramePanel> tabbedFrames = new ArrayList<>();
    public final AbstractLayoutFactory layerFactory = (AbstractLayoutFactory) FactoryManager.LAYOUT.get();
    static Image iconCancelImage = ImageProvider.getImage("src/main/java/component/icon/cancel_dark.png");
    private final JTabbedPane jTabbedPane = new JTabbedPane();

    {
        tabbedFrames.add(new TabbedFramePanel());
        tabbedFrames.add(new TabbedFramePanel());
        this.setLayout(layerFactory.factoryBorderLayout());
    }

    @Override
    public void postConstr() {

    }

    @Override
    public void preDestroy() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout());
        mainPanel.add(this.jTabbedPane);
        this.add(mainPanel);
        this.setVisible(true);
    }

    @Override
    public void init() {
        this.initTabbedPanes();
        this.postConstr();
        this.preDestroy();
    }

    private void initTabbedPanes(){
        for (TabbedFramePanel tabbed: tabbedFrames) {
            this.jTabbedPane.addTab("New Tab", new ImageIcon(MainBlockFrame.iconCancelImage),tabbed);
            tabbed.init();
        }
        this.jTabbedPane.setTabComponentAt(this.jTabbedPane.getTabCount()-1,new JButton(new ImageIcon("src/main/java/component/icon/add_dark.png")));
    }

    private void addTabb(){

    }

    private void cancelTab(){

    }



}
