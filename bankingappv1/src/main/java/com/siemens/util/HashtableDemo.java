package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.models.Customer;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

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

    }
}
