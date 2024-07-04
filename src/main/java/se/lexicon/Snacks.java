package se.lexicon;

public class Snacks extends Product {

    private final  int id;

    public Snacks(int id,double price, String snack) {
        super(price, snack);
        this.id = productSequencer.nextId();
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



