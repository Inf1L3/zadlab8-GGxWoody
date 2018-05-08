package produkt;

public class Jam extends Product {
    public Jam(double price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public void buy() {
        System.out.println("I bought jam");
    }

    @Override
    public void showInfo() {
        System.out.println("Price:" + getPrice() + " name:" + getName() + " descrie:" + getDescribe());
    }


}
