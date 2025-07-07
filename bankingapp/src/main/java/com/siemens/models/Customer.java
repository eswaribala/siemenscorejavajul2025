package com.siemens.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    private long accountNUmber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String contactNo;
    private String password;
    private Address address;
}
