package Plot;

public class Address {
    private int number;
    private int streetNo;
    private String society;
    private String block;
    private String city;
    private String state;
    private int zipCode;

    public Address(int number, int streetNo,  String block, String society, String city, String state, int zipCode){
        this.number = number;
        this.streetNo = streetNo;
        this.society = society;
        this.block = block;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString(){
        return String.format("%d-%s, %d Street, %s, %s, %s", number, block, society, city, state);
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getBlock() {
        return block;
    }

    public String getCity() {
        return city;
    }

    public int getNumber() {
        return number;
    }

    public String getSociety() {
        return society;
    }

    public String getState() {
        return state;
    }
    
    public int getStreetNo() {
        return streetNo;
    }

}
