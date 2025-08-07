import java.util.Scanner;

public class methodsBankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //JAVA BANKING PROGRAM FOR BEGINNERS

        //DECLARE VARIABLES
        double balance = 0.00;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            //DISPLAY MENU
            System.out.println("\n\n*************");
            System.out.println("BANKING PROGRAM\n************");
            System.out.print("\n1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit\n************");

            //GET AND PROCESS USER CHOICE
            System.out.print("\nEnter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }

        }
        System.out.println("Thank you have a nice day!");

    }
    //showBalance() method
    static void showBalance(double balance){
        System.out.printf("Your balance is $%.2f\n",balance);
    }

    //deposit() method
    static double deposit(){

        double amount;;
        System.out.print("Enter amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be a negative number");
            return 0;
        }
        else {
            return amount;
        }
    }

    //withdraw() method
    static double withdraw(double balance){
        double amount;

        System.out.println("Enter amount you'd like to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Funds");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Invalid amount, amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

}
