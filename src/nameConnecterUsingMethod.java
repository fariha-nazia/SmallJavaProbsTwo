import java.util.Scanner;

public class nameConnecterUsingMethod {
    public static void main(String[] args){
        /*
        * Name Connector:
        *   After providing 1st name and last name
        *   It will return the full name
        * Note: To do this get & set method is used
        *
        * */

        Scanner scan = new Scanner(System.in);
//        Declaring the variables here
        String firstName;
        String lastName;


        System.out.println("Enter first name: ");
        firstName = scan.nextLine();

        System.out.println("Enter last name: ");
        lastName = scan.nextLine();

//        To pass the argument
        String fullName = getFullName(firstName, lastName);
        System.out.println("You Full Name is: "+ fullName);

        scan.close();
    }


    /*
    * Creating the method here
    * */
    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

}
