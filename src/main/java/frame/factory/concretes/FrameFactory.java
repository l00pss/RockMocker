package frame.factory.concretes;

import frame.concretes.MainRFrame;
import frame.concretes.SplashFrame;
import frame.factory.abstracts.AbstractFrameFactory;

public class FrameFactory extends AbstractFrameFactory {
    @Override
    public MainRFrame factory() {
        return new MainRFrame("RockMocker");
    }

    @Override
    public SplashFrame factorySplash() {
        return new SplashFrame();
    }
}
