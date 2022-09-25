package Plot;

public class Person {
    private String firstName, lastName, phoneNumber, gender, cnic;
    private Address address;
    private Date dob; 

    public Person(String firstName, String lastName, String gender, String cnic, String phoneNumber, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cnic = cnic;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getCnic() {
        return cnic;
    }

    public Address getAddress() {
        return address;
    }

    public Date getDob() {
        return dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return String.format("Name: %s %s\nGender: %s\nCNIN: %s\nCell: %s\n DOB: %s", getName(), gender, cnic, phoneNumber, dob);
    }
}
