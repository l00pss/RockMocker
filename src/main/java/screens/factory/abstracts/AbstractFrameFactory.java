package screens.factory.abstracts;

import screens.concretes.MainRFrame;
import screens.concretes.SplashFrame;

public abstract class AbstractFrameFactory {
    public abstract MainRFrame factory();
    public abstract SplashFrame factorySplash();
}
