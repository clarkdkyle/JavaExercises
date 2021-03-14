package java_2.oop.bank;

public abstract class Account {

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

    private double balance;

    private int accountNumber;


    //Default constructor
    public Account() {
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.err.println("Insufficient funds...");
        }
    }
}
// getter methods
//        public double getBalance() {
//            return this.balance;
//    }
//
//    public int getAccountNumber() {
//            return this.accountNumber;
//    };

//    public abstract void deposit(double amount);
//
//
//
//    public abstract void withdraw(double amount);
//
//}
