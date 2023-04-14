package Internship;
import java.util.Scanner;
public class ATMInterface {
	
		 private double balance;

		    public ATMInterface() {
		        this.balance = 0.0;
		    }

		    public void start() {
		        System.out.println("Welcome to ATM Interface!");
		        System.out.println("1. Check balance");
		        System.out.println("2. Deposit");
		        System.out.println("3. Withdraw");
		        System.out.println("4. Exit");

		        Scanner scanner = new Scanner(System.in);
		        boolean exit = false;
		        while (!exit) {
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            switch (choice) {
		                case 1:
		                    checkBalance();
		                    break;
		                case 2:
		                    System.out.print("Enter deposit amount: ");
		                    double depositAmount = scanner.nextDouble();
		                    deposit(depositAmount);
		                    break;
		                case 3:
		                    System.out.print("Enter withdrawal amount: ");
		                    double withdrawalAmount = scanner.nextDouble();
		                    withdraw(withdrawalAmount);
		                    break;
		                case 4:
		                    System.out.println("Thank you for using ATM Interface!");
		                    exit = true;
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		                    break;
		            }
		        }
		        scanner.close();
		    }

		    private void checkBalance() {
		        System.out.println("Current balance: $" + balance);
		    }

		    private void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            System.out.println("$" + amount + " deposited successfully.");
		        } else {
		            System.out.println("Invalid deposit amount.");
		        }
		    }

		    private void withdraw(double amount) {
		        if (amount > 0) {
		            if (balance >= amount) {
		                balance -= amount;
		                System.out.println("$" + amount + " withdrawn successfully.");
		            } else {
		                System.out.println("Insufficient balance.");
		            }
		        } else {
		            System.out.println("Invalid withdrawal amount.");
		        }
		    }

		   
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ATMInterface atm = new ATMInterface();
	        atm.start();
			
		}

	}


