import java.util.Calendar;

public class HotBeverage extends Beverage{

    private int temperature;

    public HotBeverage(String name, int price, int quantity, Calendar best_before, double volume, int temperature ){
        super(name, price, quantity, best_before, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }


    @Override
    public String toString(){
        
        return "\n"+getName() + "  Price: " + getPrice() + "  Quantity: " + getQuantity() + "  Volume: " + getVolume() + "  Temperature: " + temperature 
                              + "  BestBefore: " +getBest_before().get(Calendar.DAY_OF_MONTH) +"."+ getBest_before().get(Calendar.MONTH)
                              +"." + getBest_before().get(Calendar.YEAR) ;
    }


}
