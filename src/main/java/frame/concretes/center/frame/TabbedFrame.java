package frame.concretes.center.frame;

import component.Loadable;
import component.Stateful;
import component.panel.NavigatorPanel;
import utility.Initializer;

import javax.swing.*;
import java.awt.*;

public class TabbedFrame extends JPanel implements Initializer, Loadable {

    private Integer index;
    private TabbedPanel tabbedPanel = new TabbedPanel();


    public TabbedFrame(){
        this.setLayout(new BorderLayout());
        this.add(navigatorPanel,BorderLayout.NORTH);
        this.add(this.tabbedPanel,BorderLayout.CENTER);
    }

    public TabbedFrame(Integer index){
        this();
        this.index= index;
    }

    private String nameOfTab = "New Tab ";

    private final NavigatorPanel navigatorPanel = new NavigatorPanel();

    @Override
    public void postConstr() {
        this.navigatorPanel.init();
    }

    @Override
    public void preDestroy() {}

    @Override
    public void init() {
        this.postConstr();
        this.preDestroy();
        this.setVisible(true);
    }

    public String getNameOfTab() {
        return nameOfTab.concat(String.valueOf(this.index));
    }

    public void setNameOfTab(String nameOfTab) {
        this.nameOfTab = nameOfTab;
    }


}
