import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogReader {
    private String logFilePath;

    public LogReader(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    // Чтение и фильтрация логов по уровню
    public void readLogs(LogLevel filterLevel) {
        try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("[" + filterLevel + "]")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readLogs(Logger.LogLevel logLevel) {
    }
}
