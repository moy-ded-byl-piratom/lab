import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        configManager.setSetting("database", "mysql");
        configManager.setSetting("username", "admin");
        configManager.setSetting("password", "password");

        configManager.saveSettings("settings.txt");

        configManager.loadSettings("settings.txt");

        System.out.println(configManager.getSetting("database"));
        System.out.println(configManager.getSetting("username"));
        System.out.println(configManager.getSetting("password"));

        ConfigurationManager anotherConfigManager = ConfigurationManager.getInstance();
        System.out.println(configManager == anotherConfigManager);
    }
}

