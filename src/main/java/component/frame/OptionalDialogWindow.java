package component.frame;

import component.context.DialogContext;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class OptionalDialogWindow extends SmallFrame {
    private final JPanel mainPanel = new JPanel();
    private final DialogContext dialogContext ;

    private final JPanel topPanel = new JPanel();
    private final JPanel bottomPanel = new JPanel();

    private  final JButton yesButton = new JButton("Yes");
    private  final JButton noButton = new JButton("No");


    private static final Image ICON;

    static {
        try {
            ICON = ImageIO.read(new File("src/main/java/component/icon/warningLabel.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public OptionalDialogWindow(DialogContext dialogContext) {
        super(dialogContext.header());
        this.dialogContext = dialogContext;
        this.mainPanel.setLayout(new BoxLayout(this.mainPanel,BoxLayout.Y_AXIS));
        FlowLayout flowLayout = new FlowLayout();
        this.topPanel.setLayout(flowLayout);
        this.bottomPanel.setLayout(flowLayout);
    }

    private void initUI(){
        this.mainPanel.add(Box.createRigidArea(new Dimension(0,20)));
        JLabel iconLabel = new JLabel();
        iconLabel.setIcon(new ImageIcon(new ImageIcon(ICON).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
        this.topPanel.add(iconLabel,FlowLayout.LEFT);
        this.topPanel.add(Box.createRigidArea(new Dimension(5,0)));

        JLabel question =  new JLabel(this.dialogContext.question());
        question.setFont(new Font("Roboto", Font.PLAIN, 15));
        this.topPanel.add(question);

        this.bottomPanel.add(this.yesButton);
        this.bottomPanel.add(Box.createRigidArea(new Dimension(50,0)));
        this.bottomPanel.add(this.noButton);
    }

    @Override
    public void postConstr() {
        this.initUI();
    }

    @Override
    public void preDestroy() {
        this.mainPanel.add(this.topPanel);
        this.mainPanel.add(this.bottomPanel);
        this.add(this.mainPanel);
        this.pack();
    }
}
