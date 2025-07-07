package com.siemens.models;
import com.github.javafaker.Faker;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Customer {
    //account no is constant
    private final long AccountNumber=new Faker().random().nextInt(10000000,99999999);
    //instance variable-- any variable declared inside the class-- field
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
    private static float roi;

    public static float getRoi(){
        roi=new Faker().random().nextInt(6,13)*0.01f;
        return roi;
    }

}
