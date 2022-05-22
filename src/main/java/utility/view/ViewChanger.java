package utility.view;


import com.formdev.flatlaf.*;
import com.formdev.flatlaf.FlatLaf;

public enum ViewChanger {
    DARK{
        @Override
        public FlatLaf get() {
            return new FlatDarkLaf();
        }
    }
    ,
    LIGHT{
        @Override
        public FlatLaf get() {
            return new FlatLightLaf();
        }
    },
    DRACULA{
        @Override
        public FlatLaf get() {
            return new FlatDarculaLaf();
        }
    }
    ;

    public abstract FlatLaf get();
}