package screens.concretes.center.frame.home;

import trigger.abstracts.Loadable;
import utility.ImageProvider;
import trigger.abstracts.Initializer;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JPanel implements Initializer, Loadable {

    static Image iconImage = ImageProvider.getImage("src/main/java/component/icon/cancel_dark.png");
    private Integer index;
    private final TabbedPanel tabbedPanel = new TabbedPanel();

    private final NavigatorPanel navigatorPanel = new NavigatorPanel();


    public HomeFrame(){
        this.setLayout(new BorderLayout());
        this.add(navigatorPanel,BorderLayout.NORTH);
        this.add(this.tabbedPanel,BorderLayout.CENTER);
    }

    public HomeFrame(Integer index){
        this();
        this.index= index;
    }

    private String nameOfTab = "New Tab ";



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
