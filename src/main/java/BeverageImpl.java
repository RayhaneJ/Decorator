import java.util.List;

public class BeverageImpl implements Beverage{
    List<Beverage> beverages;

    public BeverageImpl(List<Beverage> beverages){
        this.beverages = beverages;
    }

    @Override
    public void getDescription() {
        beverages.forEach(b -> b.getDescription());
    }

    @Override
    public int cost() {
        return beverages.stream().map(b -> b.cost())
                .reduce(0, (subtotal, element) -> subtotal + element);
    }
}
