public abstract class OrganizationComponent {
    protected String _name;

    public OrganizationComponent(String name) {
        this._name = name;
    }

    public String getName() {
        return _name;
    }

    public abstract double getBudget();
    public abstract int getEmployeeCount();
    public abstract void displayStructure(int depth);
}
