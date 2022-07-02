package component.context;

import java.awt.event.ActionListener;

/**
 * @see component.frame.OptionalDialogWindow
 * @param header
 * @param question
 * @param isRepeat
 * @param yesOption
 * @param noOption
 */
public record ODWContext(String header, String question,
                         Boolean isRepeat, ActionListener yesOption,
                         ActionListener noOption) { }
