import java.util.List;

public class Expresso extends BeverageImpl {
    public Expresso(List<Beverage> beverages){
        super(beverages);
    }

    @Override
    public void getDescription() {
        System.out.println("DarkRoast");
        super.getDescription();
    }
}
