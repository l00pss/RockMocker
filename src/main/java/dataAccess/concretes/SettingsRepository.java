package dataAccess.concretes;

import dataAccess.abstracts.AbstractSettingsRepository;
import dataAccess.connection.GConnection;
import dataAccess.connection.PostgreConnection;

import java.sql.Connection;

public class SettingsRepository implements AbstractSettingsRepository {
    private final GConnection gConnection = new PostgreConnection();

    @Override
    public String getLanguage() {
        Connection connection = gConnection.getConnection();
        return "AZ";
    }

    @Override
    public String getTheme() {
        return null;
    }

    @Override
    public boolean setLanguage(String theme) {
        return false;
    }

    @Override
    public boolean setTheme(String theme) {
        return false;
    }
}
