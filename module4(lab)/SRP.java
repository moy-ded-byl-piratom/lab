public class Invoice
{
    public int Id { get; set; }
    public List<Item> Items { get; set; } = new List<Item>();
    public double TaxRate { get; set; }
}
public class InvoiceCalculator
{
    public double CalculateTotal(Invoice invoice)
    {
        double subTotal = 0;
        foreach (var item in Items)
        {
            subTotal += item.Price;
        }
        return subTotal + (subTotal * invoice.TaxRate);
    }
}

public class InvoiceRepository
{
    public void SaveToDatabase(Invoice invoice)
    {
        // Логика для сохранения счета-фактуры в базу данных
    }
}
