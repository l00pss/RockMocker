package component.factory.abstracts;

import javax.swing.*;

public interface AbstractComponentFactory {

    JButton factoryButton(String nameOfButton);

    JButton factoryButton();

    JLabel factoryLabel(String labelText);

    JList<?> factoryList();

    JOptionPane factoryOptionPane();

    JScrollPane factoryScrollPane();

    JScrollBar factoryScrollBar();

    JComboBox<?> factoryComboBox();

    JTextField factoryTextField(String text);

    JTextArea factoryTextPane();

    JPasswordField factoryPasswordField();

    JTable factoryTable();

    JProgressBar factoryProgressBar();

    JRadioButton factoryRadioButton();

    JCheckBox factoryCheckBox();


}
