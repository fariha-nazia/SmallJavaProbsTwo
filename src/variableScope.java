public class variableScope {
    static int x = 3; // CLASS SCOPE

    public static void main(String[] args){
        int x = 1; // This is a LOCAL variable.
        System.out.println(x);

        doSomething();

    }

    static void doSomething(){
        int x = 2; // This is a LOCAL variable.
        System.out.println(x);
    }
}
