package utility.view;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.util.SystemInfo;
import utility.Initializer;

import javax.swing.*;
import java.awt.*;

public class ViewProvider implements Initializer {
    @Override
    public void init() {
        FlatIntelliJLaf.install();

        UIManager.put( "Button.arc", 0 );
        UIManager.put( "Component.arc", 0 );
        UIManager.put( "CheckBox.arc", 0 );
        UIManager.put( "ProgressBar.arc", 0 );

        UIManager.put( "TextComponent.arc", 5 );



        UIManager.put( "Button.arc", 999 );
        UIManager.put( "Component.arc", 999 );
        UIManager.put( "ProgressBar.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );

        UIManager.put( "Component.arrowType", "chevron" );

        UIManager.put( "Component.focusWidth", 1 );

        UIManager.put( "ScrollBar.width", 16 );

        UIManager.put( "TabbedPane.showTabSeparators", true );

        UIManager.put( "TabbedPane.tabSeparatorsFullHeight", true );

        UIManager.put( "TabbedPane.selectedBackground", Color.DARK_GRAY );

        UIManager.put( "TabbedPane.selectedBackground", Color.DARK_GRAY );

        if (SystemInfo.isMacOS && System.getProperty("apple.laf.useScreenMenuBar") == null)
            System.setProperty("apple.laf.useScreenMenuBar", "true");

        JDialog.setDefaultLookAndFeelDecorated(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
    }
}
