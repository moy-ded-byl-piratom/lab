public interface IDiscount
{
    double Calculate(double amount);
}

public class RegularDiscount : IDiscount
{
    public double Calculate(double amount)
    {
        return amount;
    }
}

public class SilverDiscount : IDiscount
{
    public double Calculate(double amount)
    {
        return amount * 0.9; // 10% скидка
    }
}

public class GoldDiscount : IDiscount
{
    public double Calculate(double amount)
    {
        return amount * 0.8; // 20% скидка
    }
}
public class DiscountCalculator
{
    public double CalculateDiscount(IDiscount discountType, double amount)
    {
        return discountType.Calculate(amount);
    }
}

