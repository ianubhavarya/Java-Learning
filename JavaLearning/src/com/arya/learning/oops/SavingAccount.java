package com.arya.learning.oops;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.04;
        System.out.println("Savings Interest: " + interest);
    }
}