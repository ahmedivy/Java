package Exercise12;

public class BasePlusCommisionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate,  grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("base-salaried %s%n%s: $%,.2f", super.toString(), "base salary", getBaseSalary());
    }
}
