package produkt;

public class Chocolate extends Product{
    public Chocolate(double price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public void buy() {
        System.out.println("I bought chocolate");
    }

    @Override
    public void showInfo() {
        System.out.println("Price:" + getPrice() + " name:" + getName() + " descrie:" + getDescribe());
    }

}

