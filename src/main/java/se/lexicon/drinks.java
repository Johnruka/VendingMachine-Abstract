package se.lexicon;

public class drinks extends Product{

    private final int id;

    public drinks(int id,String productName, long volume, double price) {
        super(price, productName);
        String volume1 = String.valueOf(volume);
        this.id = productSequencer.nextId();
    }

    @Override
    public String examine() {
        return "{ id: " + getId() + ", drinks:" + getProductName() + "with" + "quantity}";
    }

    @Override
    public String use() {
        String description = getProductName();
        return description;

    }
}
