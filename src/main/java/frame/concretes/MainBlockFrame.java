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
    private final JPanel jPanel = new JPanel();

    private final JTabbedPane jTabbedPane = new JTabbedPane();

    {
        tabbedFrames.add(new TabbedFrame());
        tabbedFrames.add(new TabbedFrame());
        tabbedFrames.add(new TabbedFrame());
        tabbedFrames.add(new TabbedFrame());
        this.setLayout(layerFactory.factoryBorderLayout());
        this.jPanel.setBackground(Color.BLUE);
        this.add(this.jPanel,BorderLayout.CENTER);
    }

    @Override
    public void postConstr() {

    }

    @Override
    public void preDestroy() {
        JPanel tabbedPanePanel = new JPanel();
        tabbedPanePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        tabbedPanePanel.add(this.jTabbedPane);

        this.add(tabbedPanePanel);
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
    }

    private void addTabb(){

    }

    private void cancelTab(){

    }


}
