package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.models.Customer;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashtableDemo {
    public static void main(String[] args) {

        Hashtable<Long, Customer> hashtable = new Hashtable<>();
        Faker faker = new Faker();
        long accountNo=0L;

        //add elements to hashtable
        for(int i=0;i<10;i++){
            accountNo=faker.random().nextLong(1000000);
            hashtable.put(accountNo,
                    new Customer( accountNo,
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().username(),
                    faker.internet().emailAddress(),
                    faker.phoneNumber().phoneNumber(),
                    faker.internet().password(),
                    null, faker.bool().bool()));
        }




        Iterator<Map.Entry<Long,Customer>> itr=hashtable.entrySet().iterator();
        Map.Entry<Long,Customer> mapEntry=null;
         while(itr.hasNext()){
              mapEntry=itr.next();
              System.out.println(mapEntry.getKey()+","+mapEntry.getValue().toString());
          }
         System.out.println("---------------------------Using Lambda-------------------------");
         //alternative
        hashtable.forEach((k,v)->System.out.println(k+","+v.toString()));

        //search

        System.out.println("Enter Key to search:");
        Scanner scanner=new Scanner(System.in);
        long key=scanner.nextLong();
        if(hashtable.containsKey(key)){
            Customer customer=hashtable.get(key);
            customer.setEmail("Param@gmail.com");
            //updating the hashtable
            hashtable.put(key,customer);
            System.out.println(customer);
        }else{
            System.out.println("Key not found");
        }


    }
}
