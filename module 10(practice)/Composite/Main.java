public class Main {
    public static void main(String[] args) {
        Department engineering = new Department("Engineering");
        engineering.addComponent(new Employee("Alice", "Engineer", 70000));
        engineering.addComponent(new Employee("Bob", "Senior Engineer", 90000));

        Department hr = new Department("HR");
        hr.addComponent(new Employee("Carol", "HR Manager", 80000));

        Department company = new Department("TechCorp");
        company.addComponent(engineering);
        company.addComponent(hr);

        company.displayStructure(1);
        System.out.println("Total Budget: " + company.getBudget());
        System.out.println("Total Employees: " + company.getEmployeeCount());
    }
}

