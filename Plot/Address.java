package Plot;

public class Address {
    private int number;
    private String streetAddress;
    private String society;
    private String block;
    private String city;
    private String state;
    private int zipCode;

    public Address(int number, String streetAddress,  String block, String society, String city, String state, int zipCode){
        this.number = number;
        this.streetAddress = streetAddress;
        this.society = society;
        this.block = block;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString(){
        return String.format("Address: %s-%s, %s, %s, %s", number, block, society, city, state);
    }

    public String getBlock() {
        return block;
    }

    public int getZipCode() {
        return zipCode;
    }
    public String getStreetAddress() {
        return streetAddress;
    }

}
