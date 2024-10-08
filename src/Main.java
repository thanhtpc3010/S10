import Coffee.CoffeeCup;
import Coffee.VirtualCoffee;
import Coffee.VirtualPerson;
import ExceptionValidation.Caculator;
import ExceptionValidation.CaculatorException;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try(Scanner sc = new Scanner(System.in)) {
//            System.out.println("Enter the number");
//            double x = sc.nextDouble();
//        }catch (ArithmeticException e   ){
//            System.out.println("Errors :" + e.getMessage());
//        }catch (InputMismatchException e ){
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("Valid number!");
//        }
//try{
//    Caculator obj =new Caculator();
//    //invoking the divine method
//    obj.divine(10,5);
//}catch (CaculatorException e){
//    Throwable t =e.getCause();

        CoffeeCup cup = new CoffeeCup();
        try {
            VirtualPerson cust = new VirtualPerson();
            VirtualCoffee.serveCustomer(cust, cup);
        } catch (UnusualTasteException e) {
            System.out.println("This coffee has an unusual taste.");
        }
    }































































}
    }
}