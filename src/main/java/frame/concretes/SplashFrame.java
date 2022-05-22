package frame.concretes;

import component.panel.PicPanel;
import component.panel.TransparentPanel;
import frame.abstracts.AbstractRWindow;
import utility.ImageProvider;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class SplashFrame extends AbstractRWindow {
    private final Image image = ImageProvider.getImage("src/main/java/component/icon/M.png",new Dimension(50,50));
    private final PicPanel mainPanel = new PicPanel("src/main/java/component/icon/splash.png");

    @Override
    public void postConstr() {
        this.mainPanel.setLayout(new BorderLayout());



        this.mainPanel.add(this.getContextPanel(),BorderLayout.NORTH);
        this.mainPanel.add(this.getLogoPanel(),BorderLayout.SOUTH);
        this.add(this.mainPanel,BorderLayout.CENTER);
        this.pack();
    }

    @Override
    public void preDestroy() {
        this.setShape(new RoundRectangle2D.Double(0, 0, 800, 400, 50, 50));
    }



    public Component getLogoPanel(){
        TransparentPanel transparentPanel = new TransparentPanel(new FlowLayout(FlowLayout.LEFT));
        final JLabel rockDevs_company = new JLabel("RockDevs Company");
        rockDevs_company.setFont(new Font("Helvetica", Font.PLAIN, 13));
        rockDevs_company.setForeground(Color.lightGray);

        transparentPanel.add(rockDevs_company);
        return transparentPanel;
    }

    public Component getContextPanel(){

        TransparentPanel transparentPanel = new TransparentPanel(new FlowLayout(FlowLayout.LEFT));
        final JLabel jLabelText = new JLabel("RockMocker");
        JSeparator sep = new JSeparator();
        final JLabel imageLabel = new JLabel(new ImageIcon(this.image));

        jLabelText.setFont(new Font("Helvetica", Font.BOLD, 45));
        jLabelText.setPreferredSize(new Dimension(300, 100));
        jLabelText.setForeground(Color.white);

        Dimension size = imageLabel.getPreferredSize();
        imageLabel.setBounds(10, 10, size.width, size.height);

        transparentPanel.add(imageLabel);
        transparentPanel.add(sep);
        transparentPanel.add(jLabelText);
        return transparentPanel;
    }



}
