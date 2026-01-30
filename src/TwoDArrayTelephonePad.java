public class TwoDArrayTelephonePad {
    public static void main(String[] args){
//        =================================================================
        /*
        * A 2D Array:
        *   - looks similar to telephone number pad
        *   - is made up of chars
        * */

//        Declaring the chars
        char[][] telephone = {{'1', '2', '3'}, // this are all chars not String thats why we use ''
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*','0', '#' }};

//        Nested loop to display the data
        for (char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }






//        =================================================================
    }
}
