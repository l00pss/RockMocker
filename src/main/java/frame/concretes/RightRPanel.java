package frame.concretes;

import component.Loadable;
import component.button.SideButton;
import component.panel.SidePanel;
import utility.Initializer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RightRPanel extends SidePanel implements Initializer, Loadable {

    static List<SideButton> SIDE_BUTTONS = new ArrayList<>();
    static SideButton databaseSideButton = new SideButton("INSERT POLICY");
    static SideButton framesSideButton = new SideButton("STRATEGY");
    static SideButton schemesSideButton = new SideButton("HISTORY");

    private final JPanel freePanel = new JPanel();

    private final Box horizontalBox  = Box.createHorizontalBox();

    static {
        RightRPanel.SIDE_BUTTONS.add(databaseSideButton);
        RightRPanel.SIDE_BUTTONS.add(framesSideButton);
        RightRPanel.SIDE_BUTTONS.add(schemesSideButton);

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
        for (SideButton sideButton: RightRPanel.SIDE_BUTTONS){
            this.horizontalBox.add(sideButton);
        }
        this.add(this.horizontalBox);
        this.add(this.freePanel);
    }
}
