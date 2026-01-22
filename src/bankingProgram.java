import java.util.Scanner;

public class bankingProgram {
    //        Will tale user input
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        /*
        * Banking Prog (Simple)
        * This prog will:
        *   - Have declared variables
        *   - Display a menu
        *   - Get and process users choice
        *   - Create method to
        *       - showBalance()
        *       - deposit()
        *       - withdraw()
        *   - The prog will until user does not Exit
        *   - Will have Exit MESSAGE
        *   - We will have an account where a fixed amount will exist
        *   - Will take user input
        * */




//        Declaring variables
        double balance = 0; // show the balance
        boolean isRunning = true; // for making a loop so the prog runs until we exit
        int choice; // to choose 1, 2, 3,4

        /*
         * Making a while loop to make sure that the code runs until isRunning = true
         * Once isRunning = false the code stops
         * This happens by taking 4 as input
         * */
        while(isRunning){
            //        Showing the Statements to User
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");

            System.out.print("Enter you choice (1 - 4): ");
            choice = scan.nextInt();
//        System.out.println(choice);


//        Making a switch for taking input from user and performing some task
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }


        System.out.println("Thank you for using Banking Program!");
        scan.close();
    }


    /*
     * All the METHODS are made here
     * */

    /*
     * Method - showBalance()
     * This will show your balance
     * Here is no return so return type is void
     * Why?
     */
    static void showBalance(double balance){
        System.out.println("**********************");
        System.out.printf("Your Balance: $%.2f\n", balance);

    }

    /*
    * Method - deposit()
    * Is static
    * Return type will be a double - Why?
    * There will be no parameters - Why?
    * */
    static double deposit(){
        double amount;
        System.out.println("Enter amount to Deposit: ");
        amount = scan.nextDouble();
        if(amount < 0){
            System.out.println("Amount cannot be -ve!");
            return 0;
        }
        else {
            return amount;
        }
    }


    /*
    * Method - withdraw()
    * Return type Double
    * There will be 1 parameter which is balance
    * */

    static double withdraw(double balance){
        double amount;
        System.out.println("Enter amount to Withdraw: ");
        amount = scan.nextDouble();

        if( amount > balance){
            System.out.println("Insufficient funds!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount cannot be -ve!");
            return 0;
        }
        else {
            return amount;
        }
    }
}
