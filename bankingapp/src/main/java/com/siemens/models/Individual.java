package com.siemens.models;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class Individual extends Customer{
    private LocalDate dob;
    private Gender gender;
}
