public class Plot {
    private Person owner;
    private Address address;
    private Dimension dimension;
    private int cost;

    public Plot(Person owner, Address address, Dimension dimension, int cost) {
        this.owner = owner;
        this.address = address;
        this.dimension = dimension;
        this.cost = cost;
    }

    public Person getOwner() {
        return owner;
    }

    public Address getAddress() {
        return address;
    }

    public int getCost() {
        return cost;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double Area() {
        return dimension.getLength() * dimension.getWidth();
    }

    public String toString() {
        return "Owner:-\n" + owner + "Address:-\n" + address + "Dimensions:-\n" + dimension + "Cost:-\nRs: " + cost;
    }

}
