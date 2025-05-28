// Client class: Test.java
package com.braindata.bankmanagement.client;

	import com.braindata.bankmanagement.service.Rbi;
    import com.braindata.bankmangement.serviceImpl.Sbi;

    import java.util.Scanner;
	
	public class Test {
	    public static void main(String[] args) {
	        Rbi bank = new Sbi();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nBank Management System");
	            System.out.println("1. Create Account");
	            System.out.println("2. Display Account Details");
	            System.out.println("3. Deposit Money");
	            System.out.println("4. Withdraw Money");
	            System.out.println("5. Balance Check");
	            System.out.println("6. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1 -> bank.createAccount();
	                case 2 -> bank.displayAllDetails();
	                case 3 -> {
	                    System.out.print("Enter amount to deposit: ");
	                    double deposit = sc.nextDouble();
	                    bank.depositMoney(deposit);
	                }
	                case 4 -> {
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdraw = sc.nextDouble();
	                    bank.withdrawal(withdraw);
	                }
	                case 5 -> bank.balanceCheck();
	                case 6 -> System.out.println("Thank you for using our banking system!");
	                default -> System.out.println("Invalid choice! Try again.");
	            }
	        } while (choice != 6);
	    }
	}



