import java.util.List;

public class DarkRoast extends BeverageImpl {
    public DarkRoast(List<Beverage> beverages) {
        super(beverages);
    }

    @Override
    public void getDescription() {
        System.out.println("DarkRoast");
        super.getDescription();
    }
}
