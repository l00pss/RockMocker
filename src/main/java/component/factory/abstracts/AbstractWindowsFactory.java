package component.factory.abstracts;

import javax.swing.*;
import java.awt.*;

public interface AbstractWindowsFactory {
    JFrame factoryFrame(String title);
    JDialog factoryDialog();
    JPanel factoryPanel();
    JTabbedPane factoryTabbedPane();
    JPanel factoryPanel(LayoutManager layoutManager);
}
