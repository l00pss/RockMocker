package core.concretes;

import com.formdev.flatlaf.FlatDarculaLaf;
import core.abstracts.MockerApplication;
import screens.concretes.MainRFrame;
import screens.concretes.SplashFrame;
import screens.factory.abstracts.AbstractFrameFactory;
import screens.factory.concretes.FrameFactory;
import trigger.abstracts.Initializer;
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
                JOptionPane.showMessageDialog(new JFrame("Error")," Win Init Application Icon exception");
            }
    }

    private final Callable<Boolean> mainCallable = ()->{
       Thread.sleep(1000);
        Stream.of(viewInitializer,mainRFrame)
                .forEach(Initializer::init);
        return true;
    };
    {
        callables.add(mainCallable);
    }

    private final Runnable runnableSplash = this.splashFrame::init;



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
