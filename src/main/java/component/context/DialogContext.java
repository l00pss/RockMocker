package component.context;

import component.frame.DialogFrame;

/**
 * @see DialogFrame
 * @param header
 * @param question
 * @param isRepeat
 * @param yesOption
 * @param noOption
 */
public record DialogContext(String header, String question) { }
