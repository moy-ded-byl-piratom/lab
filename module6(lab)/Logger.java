import java.io.*;
import java.util.Date;

public class Logger {
    private static Logger instance;
    public static LogLevel currentLogLevel = LogLevel.INFO;
    private static String logFilePath = "example.txt";
    private static final Object lock = new Object();

    private Logger() {
    }

    public static Logger GetInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public enum LogLevel {
        INFO, WARNING, ERROR
    }

    public void SetLogLevel(LogLevel level) {
        currentLogLevel = level;
    }

    public void SetLogFilePath(String path) {
        logFilePath = path;
    }

    public void Log(String message, LogLevel level) throws IOException {
        if (level.ordinal() >= currentLogLevel.ordinal()) {
            synchronized (lock) {
                try (FileWriter writer = new FileWriter(logFilePath, true)) {
                    writer.write(String.format("%s [%s] %s%n", new Date(), level, message));
                }
            }
        }
    }

    public void DisplayLogs() throws IOException {
        synchronized (lock) {
            try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
    }
}