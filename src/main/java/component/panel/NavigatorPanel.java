package component.panel;

import component.Loadable;
import component.factory.abstracts.AbstractComponentFactory;
import component.factory.abstracts.FactoryManager;
import component.Initializer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

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

        Image preferenceIcon = ImageIO.read(new File("src/main/java/component/icon/edit.png"));
        Image iconOpenP = ImageIO.read(new File("src/main/java/component/icon/install_dark.png"));
        Image iconReload = ImageIO.read(new File("src/main/java/component/icon/buildLoadChanges_dark.png"));
        Image iconGenerate = ImageIO.read(new File("src/main/java/component/icon/compile_dark.png"));
        Image iconRefactor = ImageIO.read(new File("src/main/java/component/icon/forceRefresh_dark.png"));
        Image iconExecute = ImageIO.read(new File("src/main/java/component/icon/execute_dark.png"));
        Image addRow = ImageIO.read(new File("src/main/java/component/icon/add_dark.png"));

        JButton executeButton = componentFactory.factoryButton("Execute");
        executeButton.setIcon(new ImageIcon(iconExecute));
        executeButton.addActionListener((e)->{

        });

        JButton generateButton = componentFactory.factoryButton("Generate");
        generateButton.setIcon(new ImageIcon(iconGenerate));
        generateButton.addActionListener((e)->{

        });

        JButton reloadButton = componentFactory.factoryButton("Reload");
        reloadButton.setIcon(new ImageIcon(iconReload));
        reloadButton.addActionListener((e)->{

        });

        JButton refactorButton = componentFactory.factoryButton("Refactor");
        refactorButton.setIcon(new ImageIcon(iconRefactor));
        refactorButton.addActionListener((e)->{

        });

        JButton preferenceButton = componentFactory.factoryButton("Export");
        preferenceButton.setIcon(new ImageIcon(preferenceIcon));
        preferenceButton.addActionListener((e)->{

        });

        JButton addRowButton = componentFactory.factoryButton("Add Row");
        addRowButton.setIcon(new ImageIcon(addRow));
        addRowButton.addActionListener((e)->{

        });

        Stream.of(executeButton,generateButton,refactorButton,refactorButton,preferenceButton,addRowButton)
                .forEach(this::add);
    }


}
