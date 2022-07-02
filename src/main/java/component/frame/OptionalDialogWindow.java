package component.frame;

import component.context.ODWContext;
import frame.Screen;

public class OptionalDialogWindow extends SmallFrame {


    public OptionalDialogWindow(ODWContext odwContext) {
        super(odwContext.header());
    }

    private void initUI(){
    }

    @Override
    public void postConstr() {
        this.initUI();
    }

    @Override
    public void preDestroy() {

    }
}
