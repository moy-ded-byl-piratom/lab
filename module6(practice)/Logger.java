import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
enum LogLevel {
    INFO,
    WARNING,
    ERROR
}
public class Logger {
    public static Logger instance;
    private static Lock lock = new ReentrantLock();
    private LogLevel currentLogLevel;
    private PrintWriter writer;

    private Logger(String logFilePath, LogLevel level) {
        try {
            writer = new PrintWriter(new FileWriter(logFilePath, true), true);
            currentLogLevel = level;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Logger getInstance(String logFilePath, LogLevel level) {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    instance = new Logger(logFilePath, level);
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public void log(String message, LogLevel level) {
        if (level.ordinal() >= currentLogLevel.ordinal()) {
            writer.println("[" + level + "] " + message);
        }
    }

    public void setLogLevel(LogLevel level) {
        currentLogLevel = level;
    }

    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
