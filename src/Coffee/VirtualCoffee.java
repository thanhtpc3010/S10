package Coffee;
import Exception.TooColdException;
import Exception.TooHotException;

public class VirtualCoffee {
    public static void serveCustomer(VirtualPerson cust, CoffeeCup cup){
        try{
            cust.drinkCoffee(cup);
            System.out.println("Coffee is just right");
        } catch (TooColdException e) {
            System.out.println("Coffee is too cold");
        } catch (TooHotException e) {
            System.out.println("Coffee is too hot");
        }
    }
}
