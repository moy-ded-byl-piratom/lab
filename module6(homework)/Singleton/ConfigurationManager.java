import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class ConfigurationManager {
    private static volatile ConfigurationManager instance;

    private Map<String, String> dictionary = new HashMap<>();
    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance== null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public void loadSettings(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    dictionary.put(parts[0], parts[1]);
                }
            }
        }
    }
    public void saveSettings(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
        }
    }
    public String getSetting(String key) {
        return dictionary.get(key);
    }

    public void setSetting(String key, String value) {
        dictionary.put(key, value);
    }
}