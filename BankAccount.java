package com.demo;


class BankAccount {
 protected double balance;

 public BankAccount(double balance) {
     this.balance = balance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient funds for withdrawal");
     }
 }
}


class SavingsAccount extends BankAccount {
 private static final double WITHDRAWAL_LIMIT = 1000;

 public SavingsAccount(double balance) {
     super(balance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance && amount <= WITHDRAWAL_LIMIT) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Withdrawal limit exceeded or insufficient funds");
     }
 }
}

//CheckingAccount subclass
class CheckingAccount extends BankAccount {
 private static final double OVERDRAFT_FEE = 30;

 public CheckingAccount(double balance) {
     super(balance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         balance -= OVERDRAFT_FEE; // Apply overdraft fee
         System.out.println("Overdraft fee of " + OVERDRAFT_FEE + " applied");
     }
 }

 public static void main(String[] args) {
     SavingsAccount savings = new SavingsAccount(1500);
     savings.deposit(500);
     savings.withdraw(1000);
     savings.withdraw(800);

     CheckingAccount checking = new CheckingAccount(2000);
     checking.deposit(1000);
     checking.withdraw(1500);
     checking.withdraw(3000);
 }
}
