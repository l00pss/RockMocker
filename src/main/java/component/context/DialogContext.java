package component.context;

/**
 * @see component.frame.OptionalDialogWindow
 * @param header
 * @param question
 * @param isRepeat
 * @param yesOption
 * @param noOption
 */
public record DialogContext(String header, String question) { }
