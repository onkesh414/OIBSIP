package Internship;


import java.util.Scanner;

public class Atminterface {
    private double balance; // Current balance

    public Atminterface() {
        balance = 0.0; // Initialize balance to 0.0
    }

    public void displayMenu() {
        System.out.println("ATM Menu");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
    }

    public void deposit(double amount) {
        balance += amount; // Add amount to balance
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount; // Subtract amount from balance
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs" + balance);
    }
    public void Transfer() {
    	System.out.println("Transfer ammount: Rs" + balance);
    }

    public static void main(String[] args) {
        Atminterface atm = new Atminterface(); // Create an ATM object
        Scanner scanner = new Scanner(System.in); // Create a scanner for user input

        boolean exit = false; // Flag to exit the program
        int choice; // User's menu choice

        while (!exit) {
            atm.displayMenu();
            System.out.print("Enter choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: Rs");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                    
                    
                    
           case 2:
                    System.out.print("Enter withdrawal amount: Rs");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                    
                    
                    
                      case 3:
                    atm.checkBalance();
                    break;
                
              case 4:
                	System.out.println("Enter transfer ammount: Rs");
                	double Transferamount = scanner.nextDouble();
               // 	atm.Transfer(Transferamount);
                	break;
                	
                	
                	
                     case 5:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
               	
                	
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close(); // Close the scanner
    }
}
