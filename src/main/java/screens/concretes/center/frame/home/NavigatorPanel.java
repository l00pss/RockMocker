package screens.concretes.center.frame.home;

import component.frame.InformationFrame;
import trigger.abstracts.Loadable;
import component.context.DialogContext;
import component.factory.abstracts.AbstractComponentFactory;
import component.factory.abstracts.FactoryManager;
import trigger.abstracts.Initializer;
import component.frame.ClipFrame;
import component.frame.DialogFrame;

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

        Image exportIcon = ImageIO.read(new File("src/main/java/component/icon/export_dark.png"));
        Image iconReload = ImageIO.read(new File("src/main/java/component/icon/buildLoadChanges_dark.png"));
        Image iconGenerate = ImageIO.read(new File("src/main/java/component/icon/compile_dark.png"));
        Image iconRefactor = ImageIO.read(new File("src/main/java/component/icon/forceRefresh_dark.png"));
        Image iconExecute = ImageIO.read(new File("src/main/java/component/icon/execute_dark.png"));
        Image addIcon = ImageIO.read(new File("src/main/java/component/icon/add_dark.png"));
        Image editRow = ImageIO.read(new File("src/main/java/component/icon/edit_dark.png"));
        Image undo = ImageIO.read(new File("src/main/java/component/icon/undo_dark.png"));
        Image redo = ImageIO.read(new File("src/main/java/component/icon/redo_dark.png"));
        Image delete = ImageIO.read(new File("src/main/java/component/icon/delete_dark.png"));


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
        preferenceButton.setIcon(new ImageIcon(exportIcon));
        preferenceButton.addActionListener((e)->{

        });

        JButton addRowButton = componentFactory.factoryButton("Add Column");
        addRowButton.setIcon(new ImageIcon(addIcon));
        addRowButton.addActionListener((e)->{
            ClipFrame clipFrame  = new InsertColumnFrame("Add Column");
            clipFrame.setVisible(true);
            clipFrame.init();
        });

        JButton editRowButton = componentFactory.factoryButton("Edit Column");
        editRowButton.setIcon(new ImageIcon(editRow));
        editRowButton.addActionListener((e)->{
            ClipFrame clipFrame  = new InsertColumnFrame("Edit Column");
            clipFrame.setVisible(true);
            clipFrame.init();
        });

        JButton undoButton = componentFactory.factoryButton();
        undoButton.setIcon(new ImageIcon(undo));
        undoButton.addActionListener((e)->{

        });

        JButton redoButton = componentFactory.factoryButton();
        redoButton.setIcon(new ImageIcon(redo));
        redoButton.addActionListener((e)->{
            ClipFrame clipFrame = new InformationFrame("Successful!");
            clipFrame.init();
        });

        JButton deleteButton = componentFactory.factoryButton();
        deleteButton.setIcon(new ImageIcon(delete));
        deleteButton.addActionListener((e)->{
            DialogContext dialogContext = new DialogContext("Warning!","Sure? Do you want delete?");
            ClipFrame clipFrame = new DialogFrame(dialogContext);
            clipFrame.init();
        });

        Stream.of(executeButton,generateButton,refactorButton,refactorButton,
                        preferenceButton,addRowButton,editRowButton,undoButton,redoButton,deleteButton)
                .forEach(this::add);
    }


}
