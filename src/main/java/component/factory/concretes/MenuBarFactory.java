package component.factory.concretes;

import component.factory.abstracts.AbstractMenuBarFactory;

import javax.swing.*;

public class MenuBarFactory implements AbstractMenuBarFactory {
    @Override
    public JMenuBar factoryMenuBar() {
        return new JMenuBar();
    }

    @Override
    public JMenu factoryMenu(String title) {
        return new JMenu(title);
    }

    @Override
    public JMenuItem factoryMenuItem(String title) {
        return new JMenuItem(title);
    }

    @Override
    public JPopupMenu factoryPopupMenu() {
        return new JPopupMenu();
    }

    @Override
    public JCheckBoxMenuItem factoryCheckBoxMenuItem(String title) {
        return new JCheckBoxMenuItem(title);
    }

    @Override
    public JRadioButtonMenuItem factoryRadioItemMenu(String title) {
        return new JRadioButtonMenuItem(title);
    }

    @Override
    public JToolBar factoryToolBar() {
        return new JToolBar();
    }

    @Override
    public JToolTip factoryToolTip() {
        return new JToolTip();
    }
}
