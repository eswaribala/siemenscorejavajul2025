package com.siemens.models;

import com.github.javafaker.Faker;
import com.siemens.exceptions.AgeException;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Individual extends Customer{
    private LocalDate dob;
    private Gender gender;

    public void setDob(LocalDate dob) throws AgeException {
        long age = ChronoUnit.YEARS.between(dob,LocalDate.now());
        if(age<18)
            throw new AgeException("Age should be greater than 18");
        else
          this.dob = dob;
    }
}
