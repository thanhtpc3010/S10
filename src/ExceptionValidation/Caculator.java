package ExceptionValidation;

public class Caculator {
    public void divine (int a, int b) throws CaculatorException{
        try{
            int result = a/b;
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            throw new CaculatorException("Denominator cannot be zero",e);
        }
    }
}
