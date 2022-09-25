package Plot;

public class Plot {
    private Person owner;
    private Address address;
    private Dimension dimension;

    public Plot(Person owner, Address address, Dimension dimension){
        this.owner = owner;
        this.address = address;
        this.dimension = dimension;
    }

}