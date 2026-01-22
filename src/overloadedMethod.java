public class overloadedMethod {
    public static void main(String [] args){
        System.out.println(add(1, 2, 3));

    }
    /*
    * Overloaded Method:
    * Starts here
    * */

    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }
}
