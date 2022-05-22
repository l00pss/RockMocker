package frame.factory.abstracts;

import frame.concretes.MainRFrame;
import frame.concretes.SplashFrame;

public abstract class AbstractFrameFactory {
    public abstract MainRFrame factory();
    public abstract SplashFrame factorySplash();
}
