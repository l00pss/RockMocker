package screens.factory.concretes;

import screens.concretes.MainRFrame;
import screens.concretes.SplashFrame;
import screens.factory.abstracts.AbstractFrameFactory;

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
