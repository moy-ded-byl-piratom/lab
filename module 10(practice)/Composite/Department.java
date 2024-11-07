import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void addComponent(OrganizationComponent component) {
        components.add(component);
    }

    public void removeComponent(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public double getBudget() {
        return components.stream().mapToDouble(OrganizationComponent::getBudget).sum();
    }

    @Override
    public int getEmployeeCount() {
        return components.stream().mapToInt(OrganizationComponent::getEmployeeCount).sum();
    }

    @Override
    public void displayStructure(int depth) {
        System.out.println("-".repeat(depth)+ "Department:" + _name);
        for (OrganizationComponent component : components) {
            component.displayStructure(depth + 2);
        }
    }
}
