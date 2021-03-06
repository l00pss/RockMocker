package screens.concretes.center.frame.home;

import trigger.abstracts.Loadable;
import trigger.abstracts.Initializer;

import javax.swing.*;

public class TabbedPanel extends JPanel implements Initializer, Loadable {


    private  JSplitPane topSplitPane;
    private  JSplitPane bottomSplitPane;

    private final TableBlock tableBlock = new TableBlock();
    private final ButtonBlock buttonBlock =  new ButtonBlock();
    private final ScriptBlock scriptBlock = new ScriptBlock();

    public TabbedPanel(){
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        this.topSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,this.tableBlock.getMainTable(),this.buttonBlock.getButtonPanel());
        this.bottomSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,this.topSplitPane,this.scriptBlock.getjScrollBar());
        this.add(this.bottomSplitPane);
    }


    @Override
    public void postConstr() {

    }

    @Override
    public void preDestroy() {

    }

    @Override
    public void init() {

    }
}
