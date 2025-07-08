package com.siemens.models;
import com.github.javafaker.Faker;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.lang.annotation.Inherited;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@SuperBuilder
public abstract class Customer {
    //account no is constant
    protected final long AccountNumber=new Faker().random().nextInt(10000000,99999999);
    //instance variable-- any variable declared inside the class-- field
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected String email;
    @Setter
    protected String contactNo;
    @Setter
    protected String password;
    @Setter
    protected Address address;
    protected boolean active;
    //method area
    private static float roi;

    public static float getRoi(){
        roi=new Faker().random().nextInt(6,13)*0.01f;
        return roi;
    }

    public abstract int generateOTP();

}
