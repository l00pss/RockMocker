package component.factory.abstracts;

import component.button.BlueGButton;
import component.button.GlueListButton;
import component.button.RedGButton;
import component.button.SideGButton;

public interface AbstractButtonFactory {
    BlueGButton factoryBluGeButton(String context);
    RedGButton factoryRedGButton(String context);
    GlueListButton factoryGlueListButton(String context);
    SideGButton factorySideButton(String context);
}
