public class Manager extends Employee {
    private double fixedSalary;
    private double bonus;

    public Manager(String name, int id, double fixedSalary, double bonus) {
        super(name, id, "Manager");
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return fixedSalary + bonus;
    }
}
