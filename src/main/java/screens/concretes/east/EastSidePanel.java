package screens.concretes.east;

import trigger.abstracts.Loadable;
import component.button.SideGButton;
import component.panel.SidePanel;
import trigger.abstracts.Initializer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EastSidePanel extends SidePanel implements Initializer, Loadable {

    static List<SideGButton> SIDE_BUTTONS = new ArrayList<>();
    static SideGButton databaseSideGButton = new SideGButton("INSERT POLICY");
    static SideGButton framesSideGButton = new SideGButton("STRATEGY");
    static SideGButton schemesSideGButton = new SideGButton("HISTORY");

    private final JPanel freePanel = new JPanel();

    private final Box horizontalBox  = Box.createHorizontalBox();

    static {
        EastSidePanel.SIDE_BUTTONS.add(databaseSideGButton);
        EastSidePanel.SIDE_BUTTONS.add(framesSideGButton);
        EastSidePanel.SIDE_BUTTONS.add(schemesSideGButton);

    }

    {
        this.setBorder(BorderFactory.createLineBorder(Color.gray));
    }

    @Override
    public void postConstr() {

    }

    @Override
    public void preDestroy() {

    }

    @Override
    public void init() {
        for (SideGButton sideGButton : EastSidePanel.SIDE_BUTTONS){
            this.horizontalBox.add(sideGButton);
        }
        this.add(this.horizontalBox);
        this.add(this.freePanel);
    }
}
