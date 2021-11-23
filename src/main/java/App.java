import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Milk milk = new Milk();
        Moka moka = new Moka();
        Soy soy = new Soy();
        List<Beverage> beverages = new ArrayList<Beverage>();
        beverages.add(milk);
        beverages.add(moka);

        Expresso expresso = new Expresso(beverages);
        expresso.getDescription();
        System.out.println(expresso.cost());
    }
}
