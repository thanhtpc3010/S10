package Coffee;
import Exception.TooColdException;
import Exception.TooHotException;


public class VirtualPerson {
    private static final int tooCold =65;
    private static final int tooHot =85;
    public void drinkCoffee(VirtualCoffee cup) throws TooColdException, TooHotException, TooColdException, TooHotException {
        int temperature = cup.getTemperature();
        if (temperature < tooCold){
            throw new TooColdException();
        }
        else if (temperature > tooHot){
            throw new TooHotException();
        }
    }
}
