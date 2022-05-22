package core.concretes;

import core.abstracts.MockerApplication;
import frame.factory.abstracts.AbstractFrameFactory;
import frame.factory.concretes.FrameFactory;
import utility.Initializer;
import utility.view.ViewProvider;

import java.util.stream.Stream;

public class MainRunnable implements MockerApplication {
    private final Initializer viewInitializer = new ViewProvider();
    private final AbstractFrameFactory frameFactory = new FrameFactory();
    @Override
    public void run() {
        Stream.of(viewInitializer,frameFactory.factory())
                .forEach(Initializer::init);
    }
}
