import core.abstracts.MockerApplication;
import core.concretes.MainRunnable;

import javax.swing.*;

public class RockMocker {
    public static MockerApplication mockerApplication = new MainRunnable();
    public static void main(String[] args) {
        mockerApplication.run();
    }
}
