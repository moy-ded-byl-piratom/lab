public class Singleton
{
    public void DoSomething()
    {
        Console.WriteLine("Doing something...");
    }
}

public class Client
{
    public void Execute()
    {
        Singleton s = new Singlenton();
        s.DoSomething();
    }
}