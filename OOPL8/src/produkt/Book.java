package produkt;


public class Book extends Product {

    public Book(double price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public void buy() {
        System.out.println("I bought a book");
    }

    @Override
    public void showInfo() {
        System.out.println("Price:" + getPrice() + " name:" + getName() + " descrie:" + getDescribe());
    }
}

