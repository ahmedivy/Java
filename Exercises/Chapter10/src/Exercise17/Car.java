package Exercise17;

public class Car implements CarbonFootprint {
    private double fuel;
    private double miles;

    public Car(double fuel, double miles) {
        this.fuel = fuel;
        this.miles = miles;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public double getCarbonFootprint() {
        return (fuel * miles) * 0.000001;
    }
}
