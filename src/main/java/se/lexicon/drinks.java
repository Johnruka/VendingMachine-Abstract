package se.lexicon;

public class drinks extends Product{

    public drinks(String productName, long volume, double price) {
        super(price, productName);
        String volume1 = String.valueOf(volume);
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
