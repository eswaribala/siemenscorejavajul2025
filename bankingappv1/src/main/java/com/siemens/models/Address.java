package com.siemens.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    private String doorNo;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

}
