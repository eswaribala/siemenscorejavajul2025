package com.siemens.util;

import com.siemens.models.Account;

public class AccountThread implements Runnable {

    private Account account;
    private int amount;

    public AccountThread(Account account,String name,int amount) {
        super();
        this.account = account;
        this.amount=amount;
        new Thread(this,name).start();

    }

    @Override
    public void run() {
        //applying lock
        synchronized (account) {
            account.withdraw(amount);
        }

    }
}
