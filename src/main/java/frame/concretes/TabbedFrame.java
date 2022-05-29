package frame.concretes;

import component.Loadable;
import component.Stateful;
import component.panel.NavigatorPanel;
import utility.Initializer;

import javax.swing.*;
import java.awt.*;

public class TabbedFrame extends JPanel implements Initializer, Loadable, Stateful {

    private Integer index;

    public TabbedFrame(Integer index){
        this();
        this.index= index;
    }

    private String nameOfTab = "New Tab ";


    private final NavigatorPanel navigatorPanel = new NavigatorPanel();

    public TabbedFrame(){
        this.setLayout(new BorderLayout());
        this.add(navigatorPanel,BorderLayout.NORTH);
    }

    @Override
    public void postConstr() {
        this.navigatorPanel.init();
    }

    @Override
    public void preDestroy() {

    }



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
