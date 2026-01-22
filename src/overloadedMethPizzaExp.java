public class overloadedMethPizzaExp {
    public static void main(String[] args){
        /*
        * Overloaded Method
        *   - Bake a pizza
        *
        *   */

        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);

/*        String withCheese = bakePizza("flat bread", "mozzarella");
        System.out.println(withCheese);*/



    }

    /*
    * Methods are created here
    * */
    static String bakePizza(String bread){
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping){
        return cheese + " " + bread + " " + topping + " pizza";
    }
}
