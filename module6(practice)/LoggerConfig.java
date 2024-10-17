import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class LoggerConfig {
    private String logFilePath;
    private LogLevel logLevel;

    // Геттеры и сеттеры
    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public Logger.LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    // Метод для загрузки конфигурации из JSON файла
    public static LoggerConfig loadConfig(String configFilePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(configFilePath), LoggerConfig.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
