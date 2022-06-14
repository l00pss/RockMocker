package core.concretes;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import core.abstracts.MockerApplication;
import frame.concretes.MainRFrame;
import frame.concretes.SplashFrame;
import frame.factory.abstracts.AbstractFrameFactory;
import frame.factory.concretes.FrameFactory;
import utility.Initializer;
import utility.view.ViewProvider;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class MainRunnable implements MockerApplication {
    private final Initializer viewInitializer = new ViewProvider();
    private final AbstractFrameFactory frameFactory = new FrameFactory();
    private final ExecutorService executorService =  Executors.newFixedThreadPool(5);

    private final List<Callable<Boolean>> callables = new ArrayList<>();

    private final SplashFrame splashFrame = frameFactory.factorySplash();
    private final MainRFrame mainRFrame = frameFactory.factory();


    static {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(new JFrame("Error"),"Init Application Icon exception");
        }
    }

    private final Callable<Boolean> mainCallable = ()->{
        Thread.sleep(300);
        Stream.of(viewInitializer,mainRFrame)
                .forEach(Initializer::init);
        return true;
    };

    private final Runnable runnableSplash = this.splashFrame::init;
    {
        callables.add(mainCallable);
    }


    @Override
    public void run() {
        this.executorService.execute(runnableSplash);
        try {
            boolean taskResult = true;
            List<Future<Boolean>> tasks = this.executorService.invokeAll(callables);
            for (Future<Boolean> result: tasks)
                if (!result.get()) taskResult = false;
            if (taskResult) this.splashFrame.dispose();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame("Error"),"Init Application  Exception");
        }
    }
}
