import java.util.ArrayList;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        ArrayList<Product> my_list = new ArrayList<>();
        my_list.add(new Food("Twix", 85, 100, new GregorianCalendar(2023, 10, 10, 0, 0), 90));
        my_list.add(new Food("Mars", 90, 150, new GregorianCalendar(2023, 10, 10, 0, 0), 130));
        my_list.add(new Food("Snickers", 105, 150, new GregorianCalendar(2023, 10, 10, 0, 0), 140));
        my_list.add(new Food("Bounty", 110, 130, new GregorianCalendar(2023, 10, 10, 0, 0, 0), 130));
        my_list.add(new Beverage("Pepsi", 150, 100, new GregorianCalendar(2023, 3, 8, 0, 0, 0), 0.5));
        my_list.add(new HotBeverage("Latte", 100, 1,
                new GregorianCalendar(2023, 07, 10, 0, 0, 0), 0.2, 50));
        my_list.add(new HotBeverage("Capuchino", 07, 1,
                new GregorianCalendar(2023, 07, 10, 0, 0, 0), 0.2, 50));
        my_list.add(new HotBeverage("Expresso", 80, 1,
                new GregorianCalendar(2023, 07, 10, 0, 0, 0), 0.2, 70));

        Automat list = new Automat();
        list.initProduct(my_list);

        HotAutomat hot_list = new HotAutomat();
        hot_list.initProduct(my_list);

        String name = "Latte";
        double volume = 0.2;
        int temperature = 50;

        System.out.println(hot_list.getProduct(name, volume, temperature));

    }

}
