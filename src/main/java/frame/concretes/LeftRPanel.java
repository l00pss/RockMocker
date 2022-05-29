package frame.concretes;

import component.Loadable;
import component.button.SideButton;
import component.panel.SidePanel;
import utility.Initializer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LeftRPanel extends SidePanel implements Initializer, Loadable {


    static List<SideButton> SIDE_BUTTONS = new ArrayList<>();
    static SideButton databaseSideButton = new SideButton("Database");
    static SideButton framesSideButton = new SideButton("Frames");
    static SideButton schemesSideButton = new SideButton("Schemes");


    static {
        LeftRPanel.SIDE_BUTTONS.add(databaseSideButton);
        LeftRPanel.SIDE_BUTTONS.add(framesSideButton);
        LeftRPanel.SIDE_BUTTONS.add(schemesSideButton);
    }

    {

    }
    @Override
    public void postConstr() {

    }

    @Override
    public void preDestroy() {

    }

    @Override
    public void init() {
        for (SideButton sideButton: LeftRPanel.SIDE_BUTTONS){
            this.add(sideButton);
        }
    }
}
