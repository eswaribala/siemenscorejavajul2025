package com.siemens.util;

import com.github.javafaker.Faker;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Faker faker = new Faker();
        int rows=faker.random().nextInt(3,10);
        System.out.println("Enter the number of rows"+rows);
        int[][] payments = new int[rows][];
        Scanner scanner=new Scanner(System.in);
        int col=0;

        for(int i=0;i<rows;i++){
            System.out.println("Enter the number of EMIs");
            col=scanner.nextInt();
            scanner.nextLine();
            payments[i]=new int[col];
            for(int j=0;j<col;j++){
                payments[i][j]=faker.random().nextInt(1000,10000);
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<payments[i].length;j++){
                System.out.print(payments[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
