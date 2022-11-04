package Exercise15;

import Exercise12.Date;

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
    public double getPaymentAmount() {
        return getBaseSalary() + super.getPaymentAmount();
    }

    @Override
    public String toString() {
        return String.format("base-salaried %s%n%s: $%,.2f", super.toString(), "base salary", getBaseSalary());
    }
}
