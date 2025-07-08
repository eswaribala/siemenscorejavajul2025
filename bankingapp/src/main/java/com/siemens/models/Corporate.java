package com.siemens.models;

import com.github.javafaker.Faker;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Corporate extends Customer{

    private CompanyType companyType;
    @Override
    public int generateOTP() {
        return new Faker().random().nextInt(1000,9999);
    }
}
