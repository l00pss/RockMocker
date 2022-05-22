package component.factory.concretes;


import component.factory.abstracts.AbstractLayoutFactory;

import java.awt.*;

public class LayoutFactory implements AbstractLayoutFactory {
    @Override
    public BorderLayout factoryBorderLayout() {
        return new BorderLayout();
    }

    @Override
    public FlowLayout factoryFlowLayout() {
        return new FlowLayout();
    }

    @Override
    public GridBagLayout factoryGridBagLayout() {
        return new GridBagLayout();
    }

    @Override
    public CardLayout factoryCardLayout() {
        return new CardLayout();
    }

    @Override
    public GridLayout factoryGridLayout() {
        return new GridLayout();
    }
}
