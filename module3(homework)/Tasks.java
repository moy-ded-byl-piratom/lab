public void Log(string message, string level)
{
    Console.WriteLine($"{level.ToUpper()}: {message}");
}

public void LogError(string message)
{
    Log(message, "error");
}

public void LogWarning(string message)
{
    Log(message, "warning");
}

public void LogInfo(string message)
{
    Log(message, "info");
}



public class Config
{
    public static string ConnectionString = "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
}

public class DatabaseService
{
    public void Connect()
    {
        string connectionString = Config.ConnectionString;
        // Логика подключения к базе данных
    }
}

public class LoggingService
{
    public void Log(string message)
    {
        string connectionString = Config.ConnectionString;
        // Логика записи лога в базу данных
    }
}



public void ProcessNumbers(int[] numbers)
{
    if (numbers == null || numbers.Length == 0) return;

    foreach (var number in numbers)
    {
        if (number > 0)
        {
            Console.WriteLine(number);
        }
    }
}

public void PrintPositiveNumbers(int[] numbers)
{
    foreach (var number in numbers)
    {
        if (number > 0)
        {
            Console.WriteLine(number);
        }
    }
}


public int Divide(int a, int b)
{
    if (b == 0) return 0;

    return a / b;
}

public class User
{
    public string Name { get; set; }
    public string Email { get; set; }

    public void SaveToDatabase() {}
}

public class FileReader
{
    public string ReadFile(string filePath)
    {
        return "file content";
    }
}

public class ReportGenerator
{
    public void GeneratePdfReport() {}
}


