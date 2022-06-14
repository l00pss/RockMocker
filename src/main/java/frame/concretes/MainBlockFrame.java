package frame.concretes;

import component.Loadable;
import component.factory.abstracts.AbstractLayoutFactory;
import component.factory.abstracts.FactoryManager;
import utility.ImageProvider;
import utility.Initializer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainBlockFrame extends JPanel implements Initializer, Loadable {
    private final List<TabbedFrame> tabbedFrames = new ArrayList<>();
    public final AbstractLayoutFactory layerFactory = (AbstractLayoutFactory) FactoryManager.LAYOUT.get();

    private final JTabbedPane jTabbedPane = new JTabbedPane();

    {
        tabbedFrames.add(new TabbedFrame(1));
        tabbedFrames.add(new TabbedFrame(2));
        tabbedFrames.add(new TabbedFrame(3));
        tabbedFrames.add(new TabbedFrame(4));
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
        Image image = ImageProvider.getImage("src/main/java/component/icon/cancel_dark.png");
        for (TabbedFrame tabbed: tabbedFrames) {
            this.jTabbedPane.addTab(tabbed.getNameOfTab(), new ImageIcon(image),tabbed);
            tabbed.init();
        }
        this.jTabbedPane.setTabComponentAt(this.jTabbedPane.getTabCount()-1,new JButton(new ImageIcon("src/main/java/component/icon/add_dark.png")));
    }

    private void addTabb(){

    }

    private void cancelTab(){

    }



}
