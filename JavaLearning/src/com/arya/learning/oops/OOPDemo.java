package com.arya.learning.oops;

public class OOPDemo {

    public static void main(String[] args) {

        BankAccount account1 = new SavingAccount("Arya", 10000);
        BankAccount account2 = new CurrentAccount("Anubhav", 15000);

        account1.deposit(2000);
        account1.calculateInterest();

        System.out.println();

        account2.withdraw(5000);
        account2.calculateInterest();
    }
}