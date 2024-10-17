import java.io.*;
public class LoggerMain {
    public static void main(String[] args) {
        Logger logger = Logger.GetInstance();
        logger.SetLogLevel(Logger.LogLevel.INFO);

        Thread t1 = new Thread(() -> {
            try {
                logger.Log("message 1", Logger.LogLevel.INFO);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                logger.Log("message 2", Logger.LogLevel.WARNING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                logger.Log("message 3", Logger.LogLevel.ERROR);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            logger.DisplayLogs();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
