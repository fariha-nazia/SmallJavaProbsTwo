import java.util.Scanner;

public class UserInputInArray {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        /*
        * Insert User Input into an ARRAY
        * Things to keep in mind:
        *   - Before assigning any element to an array
        *       - the compiler must know length of the array
        *   - Meaning : allocate apace for the array
        *
        * */

//        step 1: Declare the variables
        String[] foods;
        int size;


        System.out.print("Enter the number of food you want: ");
        size = scan.nextInt();
//        clear any buffer
        scan.nextLine();
//        initiating and fixing the length of an array
        foods = new String[size];

//        for loop to repeat the number of times the length of array is
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a Food: ");
            foods[i] = scan.nextLine();
        }


//        Enhanced for loop
        for(String food : foods){
            System.out.println(food);
        }


        scan.close();
    }
}
