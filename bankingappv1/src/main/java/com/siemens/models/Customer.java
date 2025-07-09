package com.siemens.models;
import com.github.javafaker.Faker;
import com.siemens.exceptions.FirstNameException;
import com.siemens.exceptions.LastNameException;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.lang.annotation.Inherited;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@SuperBuilder
public  class Customer {
    //account no is constant
    protected long AccountNumber;
    //instance variable-- any variable declared inside the class-- field
    protected String firstName;
    protected String lastName;
    protected String middleName;
    @Setter
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

    public void setFirstName(String firstName) throws FirstNameException {
        String pattern = "^[a-zA-Z]{1,20}$";
        if(!firstName.matches(pattern)){
            throw new FirstNameException(
                    "First name should be between 1 and 20 characters long and only contain alphabets");
        }else
          this.firstName = firstName;
    }

    public void setLastName(String lastName) throws LastNameException {
        String pattern = "^[a-zA-Z]{1,10}$";
        if(!lastName.matches(pattern)){
            throw new LastNameException(
                    "Last name should be between 1 and 10 characters long and only contain alphabets");
        }else
            this.lastName = lastName;
    }

    public static float getRoi(){
        roi=new Faker().random().nextInt(6,13)*0.01f;
        return roi;
    }

    //public abstract int generateOTP();

}
