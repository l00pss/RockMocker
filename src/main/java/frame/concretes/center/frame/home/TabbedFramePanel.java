package frame.concretes.center.frame.home;

import component.Loadable;
import component.Initializer;
import frame.concretes.center.frame.ResourceFrame;
import frame.concretes.center.frame.ViewFrame;
import frame.concretes.center.frame.home.HomeFrame;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class TabbedFramePanel extends JPanel implements Initializer, Loadable {
    private final JTabbedPane  jTabbedPane = new JTabbedPane();

    private final HomeFrame homeFrame = new HomeFrame();
    private final ViewFrame viewFrame = new ViewFrame();
    private final ResourceFrame resourceFrame = new ResourceFrame();

    public TabbedFramePanel(){
        this.setLayout(new BorderLayout());
        this.jTabbedPane.add(homeFrame,"Home");
        this.jTabbedPane.add(viewFrame,"View");
        this.jTabbedPane.add(resourceFrame,"Resource");
        this.add(this.jTabbedPane,BorderLayout.CENTER);
    }

    @Override
    public void init() {
        this.postConstr();
        this.preDestroy();
    }

    @Override
    public void postConstr() {
        Stream.of(homeFrame,viewFrame,resourceFrame)
                .forEach(Initializer::init);
    }

    @Override
    public void preDestroy() {

    }


}
