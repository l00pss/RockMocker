package frame.concretes.center.frame;

import javax.swing.*;

public class ScriptBlock {
    private final JTextArea jTextArea = new JTextArea();
    private final JScrollPane jScrollBar = new JScrollPane(jTextArea);


    public JScrollPane getjScrollBar() {
        return jScrollBar;
    }
}
