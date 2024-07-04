package se.lexicon;


public class App {
    public static void main(String[] args) {
        Product[] products = {
                new drinks(1,"Fanta", 1L, 50),
                new drinks(2,"Sprite", 1L, 50),
                new drinks(3,"Coca-Cola", 1L, 50),
                new drinks(4,"Mango", 1L, 65),
                new drinks(5,"Orange", 1L, 65),
                new drinks(6,"Apple", 1L, 65),
                new Snacks(7,30, "Chocolate"),
                new Snacks(8,30, "Gnuts"),
                new Snacks(9,30, "Chips"),
                new Snacks(10,45, "Muffin"),


        };
        VendingMachine vendingMachine = new IVendingMachine(products);

        for (String string : vendingMachine.getProducts()) {
            System.out.println(string);
            System.out.println("-----");

        }

        vendingMachine.addCurrency(100);
        Product Fanta = vendingMachine.request(1);
        System.out.println(Fanta.use());
        System.out.println(vendingMachine.getBalance());
    }
}
