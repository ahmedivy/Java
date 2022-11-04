package Exercise12;

public class SalariedEmployee extends Employee {
    private double weekSalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double weekSalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (weekSalary < 0.0) {
            throw new IllegalArgumentException("Week salary must be >= 0.0");
        }
        this.weekSalary = weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary < 0.0) {
            throw new IllegalArgumentException("Week salary must be >= 0.0");
        }
        this.weekSalary = weekSalary;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    @Override
    public double earnings() {
        return getWeekSalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeekSalary());
    }
}
