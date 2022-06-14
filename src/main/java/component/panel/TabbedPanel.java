package component.panel;

import component.Loadable;
import frame.concretes.center.frame.ButtonBlock;
import frame.concretes.center.frame.ScriptBlock;
import frame.concretes.center.frame.TableBlock;
import utility.Initializer;

import javax.swing.*;

public class TabbedPanel extends JPanel implements Initializer, Loadable {

    private final TableBlock tableBlock = new TableBlock();
    private final ButtonBlock buttonBlock =  new ButtonBlock();
    private final ScriptBlock scriptBlock = new ScriptBlock();

    public TabbedPanel(){
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        this.add(this.tableBlock.getMainTable());
        this.add(this.buttonBlock.getButtonPanel());
        this.add(this.scriptBlock.getjScrollBar());
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
