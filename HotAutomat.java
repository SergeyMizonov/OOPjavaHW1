public class HotAutomat extends Automat{

    public Product getProduct(String name,  double volume, int temperature){
        for (Product el : list_products) {
            if (el instanceof HotBeverage ){
                if ((((HotBeverage) el).getName().equals(name))&&
                    (((HotBeverage) el).getVolume() == (volume))&&
                    (((HotBeverage) el).getTemperature() == temperature)){
                      return el;  
                }
            }
            
        }
        return null;
    }
}
