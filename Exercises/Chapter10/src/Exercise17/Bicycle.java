package Exercise17;

public class Bicycle implements CarbonFootprint {
    private double miles;

    public Bicycle(double miles) {
        this.miles = miles;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public double getCarbonFootprint() {
        return miles * 0.000001;
    }
}
