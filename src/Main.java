//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Method:
        *   Method is a block of reuseable code that is executed when called ().
        *
        * Task:
        *    Sing Happy Birthday song 3 times using method
        * Note:
        *   method is written outside the main
        * */

//        Declaring variable
        String name = "Spongebob";
        int age = 19;
        happyBirthday(name, age);

    }

    /*
    * Method is written outside the main
    * */

//    Declaring the METHOD
static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear " + name + " !");
        System.out.printf("You are my %d years old\n", age);
        System.out.println("Happy Birthday to you!");
    }
}