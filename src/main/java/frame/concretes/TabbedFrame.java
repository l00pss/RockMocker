package frame.concretes;

import component.Loadable;
import utility.Initializer;

import javax.swing.*;

public class TabbedFrame extends JPanel implements Initializer, Loadable {

    private String nameOfTab = "New Tab";


    @Override
    public void postConstr() {

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
        return nameOfTab;
    }

    public void setNameOfTab(String nameOfTab) {
        this.nameOfTab = nameOfTab;
    }
}
