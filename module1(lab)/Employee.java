public abstract class Employee {
    private String name;
    private int id;
    private String position;

    public Employee(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return name;
    }
    public void displaySalary() {
        System.out.println(toString() + " " + calculateSalary());
    }

}
