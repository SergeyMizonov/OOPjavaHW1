import java.util.Calendar;

public abstract class Product {
    
    private String name;
    private int price;
    private int quantity;
    private Calendar best_before;

    public Product(String name, int price, int quantity, Calendar best_before){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.best_before = best_before;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public Calendar getBest_before() {
        return best_before;
    }
}
