package component.panel;

import component.Loadable;
import component.factory.abstracts.AbstractComponentFactory;
import component.factory.abstracts.FactoryManager;
import utility.Initializer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class NavigatorPanel extends JPanel implements Initializer, Loadable {

    private final AbstractComponentFactory componentFactory;
    {
        componentFactory = (AbstractComponentFactory) FactoryManager.COMPONENT.get();
    }

    @Override
    public void init() {
        this.postConstr();
        this.preDestroy();
        this.setVisible(true);
    }

    @Override
    public void postConstr()  {
        try {
            this.initButtons();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void preDestroy() {

    }

    private void initButtons() throws IOException {
        FlowLayout flowLayoutx = new FlowLayout(FlowLayout.LEFT,5,5);
        this.setLayout(flowLayoutx);

        Image iconNewProject = ImageIO.read(new File("src/main/java/component/icon/annotate_dark.png"));
        Image iconOpenP = ImageIO.read(new File("src/main/java/component/icon/install_dark.png"));
        Image iconReload = ImageIO.read(new File("src/main/java/component/icon/buildLoadChanges_dark.png"));
        Image iconGenerate = ImageIO.read(new File("src/main/java/component/icon/compile_dark.png"));
        Image iconRefactor = ImageIO.read(new File("src/main/java/component/icon/forceRefresh_dark.png"));
        Image iconExecute = ImageIO.read(new File("src/main/java/component/icon/execute_dark.png"));
        Image iconCloseTab = ImageIO.read(new File("src/main/java/component/icon/cancel_dark.png"));

        JButton newProject = componentFactory.factoryButton("New Tab");
        newProject.setIcon(new ImageIcon(iconNewProject));
        newProject.addActionListener((e)->{

        });
        this.add(newProject);
    }


}
