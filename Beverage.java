import java.util.Calendar;

public class Beverage extends Product {

    private double volume;

    public Beverage(String name, int price, int quantity, Calendar best_before, double volume ){
        super(name, price, quantity, best_before);
        this.volume = volume;
    }
    
    public double getVolume() {
        return volume;
    }
    
        

    @Override
    public String toString(){
        
        return "\n"+getName() + "  Price: " + getPrice() + "  Quantity: " + getQuantity() + "  Volume: " + volume 
                              + "  BestBefore: " +getBest_before().get(Calendar.DAY_OF_MONTH) +"."+ getBest_before().get(Calendar.MONTH)
                              +"." + getBest_before().get(Calendar.YEAR) ;
    }


}
