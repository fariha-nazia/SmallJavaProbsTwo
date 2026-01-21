public class checkAgeMethod {
    public static void main(String[] args){
        int age = 16;
        if (ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up!");
        }

    }

    /*
    * Methods are declared below
    * */

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else {
            return false;
        }
    }
}
