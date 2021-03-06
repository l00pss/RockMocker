package utility.view;

import trigger.abstracts.Initializer;

import javax.swing.*;
import java.awt.*;

public class ViewProvider implements Initializer {
    @Override
    public void init() {

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

        UIManager.put( "TabbedPane.showTabSeparators",true);

        UIManager.put( "TabbedPane.tabSeparatorsFullHeight", true );

        UIManager.put( "TabbedPane.selectedBackground", Color.DARK_GRAY );

        UIManager.put( "TabbedPane.selectedBackground", Color.DARK_GRAY );


//        if (SystemInfo.isMacOS && System.getProperty("apple.laf.useScreenMenuBar") == null){
//            System.setProperty("apple.laf.useScreenMenuBar", "true");
//            try {
//                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
//                JOptionPane.showMessageDialog(new JFrame("Error"),"Init Application Icon exception");
//            }
//        }else {
//            try {
//                UIManager.setLookAndFeel(new FlatDarculaLaf());
//            } catch (UnsupportedLookAndFeelException e) {
//                JOptionPane.showMessageDialog(new JFrame("Error")," Win Init Application Icon exception");
//            }
//        }

        JDialog.setDefaultLookAndFeelDecorated(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
    }

//    @Override
//    public void init(){};
}
