public interface IWork { void Work();}

public interface IEat { void Eat();}

public interface ISleep { void Sleep();}

public class HumanWorker : IWork, IEat, ISleep {
    public void Work ()
    {
        // Логика работы
    }

    public void Eat ()
    {
        // Логика питания
    }

    public void Sleep()
    {
        // Логика сна
    }
}

public class RobotWorker : IWork {
    public void Work ()
    {
        // Логика работы
    }
}