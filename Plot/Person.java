package Plot;

import java.util.Date;

public class Person {
    private String firstName, lastName, phoneNumber, gender, cnic;
    private Address address;
    private Date dob; 

    public Person(String firstName, String lastName, String gender, String cnic, String cell, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cnic = cnic;
        this.phoneNumber = cell;
        this.address = address;
    }

}
