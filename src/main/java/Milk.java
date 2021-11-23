public class Milk implements Beverage{
    @Override
    public void getDescription() {
        System.out.println("Milk");
    }

    @Override
    public int cost() {
        return 4;
    }
}
