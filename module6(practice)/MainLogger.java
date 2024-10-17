import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainLogger {
    public static void main(String[] args) {
        // Загрузка конфигурации
        LoggerConfig config = LoggerConfig.loadConfig("config.json");
        Logger logger = Logger.getInstance(config.getLogFilePath(), config.getLogLevel());

        // Создание пула потоков
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            for (int i = 0; i < 10; i++) {
                logger.log("INFO message " + i, Logger.LogLevel.INFO);
            }
        });

        executor.submit(() -> {
            for (int i = 0; i < 10; i++) {
                logger.log("WARNING message " + i, Logger.LogLevel.WARNING);
            }
        });

        executor.submit(() -> {
            for (int i = 0; i < 10; i++) {
                logger.log("ERROR message " + i, Logger.LogLevel.ERROR);
            }
        });

        executor.shutdown();

        LogReader logReader = new LogReader(config.getLogFilePath());
        System.out.println("Errors in log:");
        logReader.readLogs(Logger.LogLevel.ERROR);

        logger.close();
    }
}
