package screens.concretes;

import trigger.abstracts.Loadable;
import component.factory.abstracts.AbstractMenuBarFactory;
import component.factory.concretes.MenuBarFactory;
import trigger.abstracts.Initializer;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.stream.Stream;

public class MenuBar extends JMenuBar implements Initializer, Loadable {

    private final AbstractMenuBarFactory menuBarFactory;
    {
        menuBarFactory = new MenuBarFactory();
    }

    private final JMenu file = menuBarFactory.factoryMenu("File");
    private final JMenu edit = menuBarFactory.factoryMenu("Edit");
    private final JMenu windows = menuBarFactory.factoryMenu("Windows");
    private final JMenu help = menuBarFactory.factoryMenu("Help");

    @Override
    public void init() {
        postConstr();
        this.setVisible(true);
        preDestroy();
    }

    @Override
    public void postConstr() {
        Stream.of("New","Open","Open Recent","Close Project","Save","Save As",
                        "Reload Project","Export","Power Safe Mode","Exit")
                .map(menuBarFactory::factoryMenuItem)
                .forEach(this.file::add);

        Stream.of("Undo","Ero")
                .map(menuBarFactory::factoryMenuItem)
                .forEach(this.edit::add);

        this.windows.setMnemonic(KeyEvent.VK_O);
        {
            ButtonGroup directionGroup = new ButtonGroup();

            JMenuItem windowsSettings = menuBarFactory.factoryMenuItem("Settings");
            windows.add(windowsSettings);

            JMenu windowsTheme = menuBarFactory.factoryMenu("Themes");
            windowsTheme.setMnemonic(KeyEvent.VK_O);
            windows.add(windowsTheme);

            JRadioButtonMenuItem dark = new JRadioButtonMenuItem("Dark", true);
            dark.setMnemonic(KeyEvent.VK_F);
            windowsTheme.add(dark);
            directionGroup.add(dark);
            dark.addActionListener((e)->{

            });

            JRadioButtonMenuItem light = new JRadioButtonMenuItem("Light");
            light.setMnemonic(KeyEvent.VK_B);
            windowsTheme.add(light);
            directionGroup.add(light);
            light.addActionListener((e)->{

            });

        }

        Stream.of("Tutorial","HelpDesk")
                .map(menuBarFactory::factoryMenuItem)
                .forEach(this.help::add);

        Stream.of(file,edit,windows,help)
                .forEach(this::add);
    }

    @Override
    public void preDestroy() {

    }
}
