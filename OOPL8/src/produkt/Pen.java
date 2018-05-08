package produkt;

public class Pen extends Product {

    public Pen(double price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public void buy() {
        System.out.println("I bought pen");
    }

    @Override
    public void showInfo() {
        System.out.println("Price:" + getPrice() + " name:" + getName() + " descrie:" + getDescribe());
    }
}
