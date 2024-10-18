public class Discount implements Cloneable {
    private String description;
    private double amount;

    public Discount(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public Discount clone() {
        try {
            return (Discount) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return description + " " + amount;
    }
}

