package com.siemens.models;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


public class BankingAccount {

    @Setter
    @Getter
    private long amount;


    public BankingAccount(long amount) {
        this.amount = amount;

    }

    //non static inner class
    public class Transaction{

        @Setter
        @Getter
        private LocalDate dateOfTransaction;

        public Transaction(LocalDate dateOfTransaction) {
            this.dateOfTransaction = dateOfTransaction;
        }

        public void showTransactionDetails(){
            System.out.println("Date of Transaction: "+dateOfTransaction);
            //Transaction class can access outer class private member
            System.out.println("Amount: "+amount);
        }


    }
}
