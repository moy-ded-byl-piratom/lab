public class Employee extends OrganizationComponent{
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        super(name);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getBudget() {
        return salary;
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }

    @Override
    public void displayStructure(int depth) {
        System.out.println("-".repeat(depth) + "Employee: " + _name + " - " + position);
    }
}
