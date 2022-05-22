package component.factory.concretes;

import component.factory.abstracts.AbstractWindowsFactory;

import javax.swing.*;
import java.awt.*;

public class WindowsFactory implements AbstractWindowsFactory {
    @Override
    public JFrame factoryFrame(String title) {
        return new JFrame(title);
    }

    @Override
    public JDialog factoryDialog() {
        return new JDialog();
    }

    @Override
    public JPanel factoryPanel() {
        return new JPanel();
    }

    @Override
    public JTabbedPane factoryTabbedPane() {
        return new JTabbedPane();
    }

    @Override
    public JPanel factoryPanel(LayoutManager layoutManager) {
        return new JPanel(layoutManager);
    }
}
