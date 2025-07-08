package com.siemens.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Individual extends Customer{
    private LocalDate dob;
    private Gender gender;
}
