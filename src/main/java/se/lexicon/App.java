package se.lexicon;


public class App {
    public static void main(String[] args) {
        Product[] products = {
                new drinks("Fanta", 1L,50),
                new drinks("Srite", 1L,50),
                new drinks("Coca-Cola", 1L,50),
                new drinks("Mango", 1L,65),
                new drinks("Orange", 1L,65),
                new drinks("Apple", 1L,65),
                new Snacks(30, "Chocolate"),
                new Snacks(30, "Gnuts"),
                new Snacks(30, "Chips"),
                new Snacks(45, "Muffin"),


        };

    }
}
