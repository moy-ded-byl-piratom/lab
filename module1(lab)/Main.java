import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Worker worker1 = new Worker("A", 1, 20.0, 160);
        Manager manager1 = new Manager("C", 3, 50000, 5000);


        employees.add(worker1);
        employees.add(manager1);

        for (Employee employee : employees) {
            employee.displaySalary();
        }

    }
}

