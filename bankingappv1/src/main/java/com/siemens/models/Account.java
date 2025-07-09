package com.siemens.models;

import lombok.Data;

@Data
public class Account {
    private long balance;
    public Account(long balance){
        this.balance = balance;
    }

    public void withdraw(long amount){
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("Withdrawal Successful"+" Amount: "+amount+" Balance: "+this.balance);
        }else {
            System.out.println("Insufficient Funds"+" Amount: "+amount+" Balance: "+this.balance);
        }
    }


}
