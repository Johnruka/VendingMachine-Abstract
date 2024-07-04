package se.lexicon;

public class Snacks extends Product {

    public Snacks(double price, String snack) {
        super(price, snack);
    }

    @Override
    public String examine() {
        return "{ id: " + getId() + ", snack:" + getProductName() + " } ";

    }

    @Override
    public String use() {
        return getProductName();


    }
}



