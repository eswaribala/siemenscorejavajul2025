package com.siemens.models;

import com.github.javafaker.Faker;

import com.siemens.exceptions.AgeException;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.*;
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

    public void setDob(LocalDate dob) throws AgeException, IOException {
        long age = ChronoUnit.YEARS.between(dob,LocalDate.now());
        BufferedReader bufferedReader=null;
        File file = new File("E:\\siemenscorejavajul2025\\bankingappv1\\src\\main\\resources","testparam.csv");
        String line=null;
        int ageValue=0;
        if (file.exists()) {
            System.out.println("File exists");
            try {
                bufferedReader=new BufferedReader(new FileReader(file));
                bufferedReader.readLine();
                while ((line=bufferedReader.readLine())!=null){
                    System.out.println(line);
                     ageValue=Integer.parseInt(line);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }finally {
                 bufferedReader.close();
            }
        }else{
            System.out.println("File does not exist");
        }

        if(age<ageValue)
            throw new AgeException("Age should be greater than 18");
        else
          this.dob = dob;
    }
}
