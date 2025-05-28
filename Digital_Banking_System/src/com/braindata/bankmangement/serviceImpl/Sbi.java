package com.braindata.bankmangement.serviceImpl;

import java.util.Scanner;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi {

    private Account account;
    private Scanner sc = new Scanner(System.in);

    @Override
    public void createAccount() {
        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.println("Enter your Name:");
        String name = sc.nextLine();

        System.out.println("Enter your Mobile Number:");
        String mobNo = sc.nextLine();

        System.out.println("Enter your Aadhaar Card Number:");
        String adhar = sc.nextLine();

        System.out.println("Enter your Gender:");
        String gender = sc.nextLine();

        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.println("Enter your Current Balance:");
        double balance = sc.nextDouble();

        account = new Account(accNo, name, mobNo, adhar, gender, age, balance);
        System.out.println("Account created successfully!");
    }

    @Override
    public void displayAllDetails() {
        if (account == null) {
            System.out.println("No account found!");
            return;
        }
        System.out.println("Account Details:");
        System.out.println("Account Number: " + account.getAccNo());
        System.out.println("Name: " + account.getName());
        System.out.println("Mobile Number: " + account.getMobNo());
        System.out.println("Aadhaar Number: " + account.getAdharNo());
        System.out.println("Gender: " + account.getGender());
        System.out.println("Age: " + account.getAge());
        System.out.println("Balance: ₹" + account.getBalance());
    }

    @Override
    public void depositMoney(double amount) {
        if (account == null) {
            System.out.println("No account found!");
            return;
        }
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Amount deposited successfully! New Balance: ₹" + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdrawal(double amount) {
        if (account == null) {
            System.out.println("No account found!");
            return;
        }
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Amount withdrawn successfully! New Balance: ₹" + account.getBalance());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    @Override
    public void balanceCheck() {
        if (account == null) {
            System.out.println("No account found!");
            return;
        }
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
