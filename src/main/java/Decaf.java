import java.util.List;

public class Decaf extends BeverageImpl {
    public Decaf(List<Beverage> beverages) {
        super(beverages);
    }

    @Override
    public void getDescription() {
        System.out.println("DarkRoast");
        super.getDescription();
    }
}
