public class Employee {
    private String name;
    private int employeeID;
    private String designation;
    static int count = 0;

    public Employee(String name, String designation) {
        this.name = name;
        this.employeeID = count++;
        this.designation = designation;
    }

    // Copy Constructor
    public Employee(Employee other){
        this.name = other.getName();
        this.employeeID = count++;
        this.designation = other.getDesignation();
    }

    public String getDesignation() {
        return designation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    protected Object clone() {
        return new Employee(this);
    }
}
