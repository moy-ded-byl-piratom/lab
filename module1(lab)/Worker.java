public class Worker extends Employee {
    private double rate;
    private int hours;
    public Worker(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id, "Worker");
        this.rate = hourlyRate;
        this.hours = hoursWorked;
    }
    public double calculateSalary() {
        return rate * hours;
    }
}

