package com.arya.learning.oops;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account has no interest.");
    }
}