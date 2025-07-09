package com.siemens.util;

import com.github.javafaker.Faker;
import lombok.Synchronized;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerThread implements Runnable{

    private List<String> messages;

    public ProducerConsumerThread(){
        messages = new ArrayList<>();

    }

    public synchronized void producer()  {
        System.out.println("Producer Thread"+Thread.currentThread().getName());
        if (messages.isEmpty()){
            System.out.println("Producer is empty");
            for(int i=0;i<100;i++){
                messages.add(new Faker().shakespeare().romeoAndJulietQuote());
            }
            notify();

        }else{
            try {
                wait();
            }catch(InterruptedException ex){
               System.out.println(ex.getMessage());
            }
        }

    }

    public synchronized void consumer(){
        System.out.println("Consumer Thread"+Thread.currentThread().getName());
        if (messages.isEmpty()){
            System.out.println("Consumer is message empty");
            try {
                wait();
            }catch(InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }else{
            messages.stream().forEach(System.out::println);
            notify();
        }

    }



    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("Producer")){
            producer();
        }else
            consumer();

    }
}
