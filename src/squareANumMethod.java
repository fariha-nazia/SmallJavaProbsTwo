public class squareANumMethod {
    public static void main(String[] args){
        /*
        * Square a Number Using METHOD
        * Here:
        *   - Square the number
        *   - Return the result
        *
        * Note:
        *   if we did not return anything we could use void
        *   but if we return a double we need to write DOUBLE
        *   Basically data type of what we are returning.
        * */

//        Declaring the number
        double squareTheNum = square(2);
        System.out.println(squareTheNum);

        double cubeTheNum = cube(2);
        System.out.println(cubeTheNum);

    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }
}
