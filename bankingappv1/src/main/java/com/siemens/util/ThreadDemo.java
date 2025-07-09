package com.siemens.util;

import com.github.javafaker.Faker;
import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.util.Scanner;

public class ThreadDemo {
    public static void main(String[] args) {
       // AnimationThread animationThread=new AnimationThread(new Faker().name().firstName());
       // animationThread.start();

        ManagerThread managerThread=new ManagerThread();
        //start the thread
        Thread thread=new Thread(managerThread);
        thread.start();
        //interrupt the thread
        Scanner scanner=new Scanner(System.in);
        System.out.println("Press any key to interrupt the thread");
        String input=scanner.nextLine();
        if(input.equals("q")){
            thread.interrupt();
        }



    }
}
