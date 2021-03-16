package java_2.oop.bank;

import java.util.List;

public class Account {

	/*
		Properties:
			Bank (bank where the account is stored)
			accountNumber
			accountHolder (Customer)
			balance
			type (savings, checking, etc.)
			transactions (list of transactions)

		Methods :
			deposit(money); //add to the balance and the transaction history
			withdraw(money); //withdraw from the balance and add to the transaction history;


	 */

    String bank, accountNumber;
    Customer accountHolder;
    double balance;
    String typeofAccount;
    List<String> transactions;


    //Default constructor

    public Account(String Bank, String accountNumber, Customer accountHolder, double balance, String typeOfAccount, List transactions) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.typeofAccount = typeofAccount;
        this.transactions = transactions;
    }

    public void deposit(double amount) {
        this.balance = balance + amount;
       this.accountHolder.wallet = amount;
        System.out.println("Depositing" + amount + "into account" + accountNumber );
        System.out.println("Your new balance is: " + balance );
        System.out.println("You have " + this.accountHolder.wallet + "in your wallet");
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            this.accountHolder.wallet += amount;
            System.out.println("withdrawing" + amount + "from account" + accountNumber);
            System.out.println("Your new balance is: " + balance);
            System.out.println("You have " + this.accountHolder.wallet + "in your wallet");


        } else {
            System.err.println("Insufficient funds...");
        }
    }

        @Override
        public String toString() {
            return "Account{" +
                    "bank='" + bank + '\'' +
                    ", accountNumber='" + accountNumber + '\'' +
                    ", type='" + typeofAccount + '\'' +
                    ", accountHolder=" + accountHolder +
                    ", balance=" + balance +
                    ", transactions=" + transactions +
                    '}';
        }

    }



