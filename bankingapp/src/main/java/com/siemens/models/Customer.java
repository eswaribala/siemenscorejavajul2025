package com.siemens.models;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Customer {
    //instance variable-- any variable declared inside the class-- field
    private long accountNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String contactNo;
    private String password;
    private Address address;
    private boolean active;

}
