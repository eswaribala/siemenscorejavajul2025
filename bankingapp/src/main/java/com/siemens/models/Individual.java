package com.siemens.models;

import com.github.javafaker.Faker;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Individual extends Customer{
    private LocalDate dob;
    private Gender gender;

    @Override
    public int generateOTP() {
        return new Faker().random().nextInt(1000,9999);
    }
}
