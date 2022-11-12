package Exercise17;

public class Building implements CarbonFootprint {
    private double electricity;
    private double gas;
    private double water;

    public Building(double electricity, double gas, double water) {
        this.electricity = electricity;
        this.gas = gas;
        this.water = water;
    }

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public double getCarbonFootprint() {
        return (electricity + gas + water) * 0.000001;
    }
}