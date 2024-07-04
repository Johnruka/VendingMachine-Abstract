package se.lexicon;

public class drinks extends Product{

    private final int quantity;

    public drinks(String productName, int quantity, double price) {
        super(price, productName);
        this.quantity = quantity;
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
