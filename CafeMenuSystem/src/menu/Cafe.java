package menu;

import java.util.ArrayList;

public class Cafe {
    private ArrayList<String> products;
    private ArrayList<Double> prices;

    private ArrayList<Integer> rating;

    public Cafe() {
        products = new ArrayList<String>();
        prices = new ArrayList<Double>();
        rating = new ArrayList<Integer>();
    }

    public void addProduct(String productName, double price){
        this.products.add(productName);
        this.prices.add(price);
        this.rating.add(0);
    }

    public void removeProduct(String productName){
        int index = this.products.indexOf(productName);
        this.products.remove(index);
        this.prices.remove(index);
        this.rating.remove(index);
    }
    public void displayMenu() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i) + ": $" + prices.get(i));
        }
    }

}
