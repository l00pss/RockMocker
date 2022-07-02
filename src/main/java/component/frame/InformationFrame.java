package component.frame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class InformationFrame  extends SmallFrame{
    private final String context;
    private final JPanel mainPanel = new JPanel();
    private final JButton okButton = new JButton("OK!");

    private final JPanel topPanel = new JPanel();

    private static final Image ICON;

    static {
        try {
            ICON = ImageIO.read(new File("src/main/java/component/icon/warningLabel.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public InformationFrame(String context){
        super();
        this.context = context;
        this.mainPanel.setLayout(new BoxLayout(this.mainPanel,BoxLayout.Y_AXIS));
        this.topPanel.setLayout(new FlowLayout());
    }

    @Override
    public void postConstr() {
        this.mainPanel.add(Box.createRigidArea(new Dimension(0,15)));

        JLabel iconLabel = new JLabel();
        iconLabel.setIcon(new ImageIcon(new ImageIcon(ICON).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
        this.topPanel.add(iconLabel);

        JLabel label = new JLabel(this.context);
        label.setFont(new Font("Roboto", Font.PLAIN, 15));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.topPanel.add(label);
        okButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    @Override
    public void preDestroy() {
        this.mainPanel.add(this.topPanel,FlowLayout.CENTER);
        this.mainPanel.add(this.okButton);
        this.add(this.mainPanel);
        this.pack();
    }
}
