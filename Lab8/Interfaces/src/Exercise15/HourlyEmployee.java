package Exercise15;

import Exercise12.Date;

public class HourlyEmployee extends Employee {

    private double wages;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wages, double hours) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wages < 0.0) {
            throw new IllegalArgumentException("Wages must be >= 0.0");
        }
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }
        this.wages = wages;
        this.hours = hours;
    }

    public void setWages(double wages) {
        if (wages < 0.0) {
            throw new IllegalArgumentException("Wages must be >= 0.0");
        }
        this.wages = wages;
    }

    public double getWages() {
        return wages;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double getPaymentAmount() {
        if (getHours() <= 40) {
            return (getWages() * getHours());
        } else {
            return (40 * getWages() + (getHours() - 40) * getWages() * 1.5);
        }
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWages(), "hours worked", getHours());
    }
}
