package component.factory.abstracts;


import component.factory.concretes.ComponentFactory;
import component.factory.concretes.LayoutFactory;
import component.factory.concretes.MenuBarFactory;
import component.factory.concretes.WindowsFactory;

public enum FactoryManager {
    COMPONENT{
        @Override
        public Object get() {
            return new ComponentFactory();
        }
    },
    MENU_BAR{
        @Override
        public Object get() {
            return new MenuBarFactory();
        }
    },
    WINDOWS{
        @Override
        public Object get() {
            return new WindowsFactory();
        }
    },
    LAYOUT{
        @Override
        public Object get() {
            return new LayoutFactory();
        }
    };

    public abstract Object get();

}
