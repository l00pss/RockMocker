package component.factory.abstracts;

import javax.swing.*;
import java.awt.*;

public interface AbstractLayoutFactory {

    BorderLayout factoryBorderLayout();

    FlowLayout factoryFlowLayout();

    GridBagLayout factoryGridBagLayout();


    CardLayout factoryCardLayout();


    GridLayout factoryGridLayout();
}
