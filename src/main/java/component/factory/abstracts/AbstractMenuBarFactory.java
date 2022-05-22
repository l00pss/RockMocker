package component.factory.abstracts;

import javax.swing.*;

public interface AbstractMenuBarFactory {

    JMenuBar factoryMenuBar();

    JMenu factoryMenu(String title);

    JMenuItem factoryMenuItem(String title);

    JPopupMenu factoryPopupMenu();

    JCheckBoxMenuItem factoryCheckBoxMenuItem(String title);

    JRadioButtonMenuItem factoryRadioItemMenu(String title);

    JToolBar factoryToolBar();

    JToolTip factoryToolTip();


}
