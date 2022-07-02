package frame.concretes.center.frame.home;

import javax.swing.*;

public class ScriptBlock {
    private final JTextArea jTextArea = new JTextArea();
    private final JScrollPane jScrollBar = new JScrollPane(jTextArea);


    public JScrollPane getjScrollBar() {
        return jScrollBar;
    }
}
