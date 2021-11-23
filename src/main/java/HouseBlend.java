import java.util.List;

public class HouseBlend extends BeverageImpl {
    public HouseBlend(List<Beverage> beverages){
        super(beverages);
    }

    @Override
    public void getDescription() {
        System.out.println("DarkRoast");
        super.getDescription();
    }
}
