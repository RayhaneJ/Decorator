public class Moka implements Beverage{
    @Override
    public void getDescription() {
        System.out.println("Moka");
    }

    @Override
    public int cost() {
        return 5;
    }
}
