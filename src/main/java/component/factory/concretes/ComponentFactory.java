package component.factory.concretes;

import component.factory.abstracts.AbstractComponentFactory;

import javax.swing.*;

public class ComponentFactory implements AbstractComponentFactory {
    @Override
    public JButton factoryButton(String nameOfButton) {
        return new JButton(nameOfButton);
    }

    @Override
    public JLabel factoryLabel(String labelText) {
        return new JLabel(labelText);
    }

    @Override
    public JList<?> factoryList() {
        return new JList<>();
    }

    @Override
    public JOptionPane factoryOptionPane() {
        return new JOptionPane();
    }

    @Override
    public JScrollPane factoryScrollPane() {
        return new JScrollPane();
    }

    @Override
    public JScrollBar factoryScrollBar() {
        return new JScrollBar();
    }

    @Override
    public JComboBox<?> factoryComboBox() {
        return new JComboBox<>();
    }

    @Override
    public JTextField factoryTextField(String text) {
        return new JTextField();
    }

    @Override
    public JTextArea factoryTextPane() {
        return new JTextArea();
    }

    @Override
    public JPasswordField factoryPasswordField() {
        return new JPasswordField();
    }

    @Override
    public JTable factoryTable() {
        return new JTable();
    }

    @Override
    public JProgressBar factoryProgressBar() {
        return new JProgressBar();
    }

    @Override
    public JRadioButton factoryRadioButton() {
        return new JRadioButton();
    }

    @Override
    public JCheckBox factoryCheckBox() {
        return new JCheckBox();
    }
}
