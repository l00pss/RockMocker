package frame.concretes.right;

import component.Loadable;
import component.button.SideGButton;
import component.panel.SidePanel;
import utility.Initializer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RightRPanel extends SidePanel implements Initializer, Loadable {

    static List<SideGButton> SIDE_BUTTONS = new ArrayList<>();
    static SideGButton databaseSideGButton = new SideGButton("INSERT POLICY");
    static SideGButton framesSideGButton = new SideGButton("STRATEGY");
    static SideGButton schemesSideGButton = new SideGButton("HISTORY");

    private final JPanel freePanel = new JPanel();

    private final Box horizontalBox  = Box.createHorizontalBox();

    static {
        RightRPanel.SIDE_BUTTONS.add(databaseSideGButton);
        RightRPanel.SIDE_BUTTONS.add(framesSideGButton);
        RightRPanel.SIDE_BUTTONS.add(schemesSideGButton);

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
        for (SideGButton sideGButton : RightRPanel.SIDE_BUTTONS){
            this.horizontalBox.add(sideGButton);
        }
        this.add(this.horizontalBox);
        this.add(this.freePanel);
    }
}
