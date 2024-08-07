package se.lexicon;

public abstract class Product {

    private static int sequencer = 0;
    private final int id;
    private double price;
    private String productName;

    public Product(double price, String productName) {
        this.id = ++sequencer;
        this.price = price;
        this.productName = productName;
    }

    /**
     * Abstract method to examine the product
     */

    public abstract String examine();

    /**
     * Abstract method to use the product.
     */

    public abstract String use();


    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;


    }


}


