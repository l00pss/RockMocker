package dataAccess.abstracts;

public interface AbstractSettingsRepository {

    String getLanguage();

    String getTheme();

    boolean setLanguage(final String theme);

    boolean setTheme(final String theme);

}
