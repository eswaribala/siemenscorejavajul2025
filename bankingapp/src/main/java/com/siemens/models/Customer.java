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
    @Setter
    private String contactNo;
    @Setter
    private String password;
    @Setter
    private Address address;
    private boolean active;
    //method area
    public static float roi;

}
