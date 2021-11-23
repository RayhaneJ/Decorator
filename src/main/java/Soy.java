public class Soy implements Beverage{
    @Override
    public void getDescription() {
        System.out.println("Soy");
    }

    @Override
    public int cost() {
        return 7;
    }
}
