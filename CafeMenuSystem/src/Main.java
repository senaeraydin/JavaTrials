import menu.Cafe;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        cafe.addProduct("German sausage and chips", 6.5);
        cafe.addProduct("Italian cheese & tomato pizza", 4.5);
        cafe.addProduct("Tomato Soup", 2.0);
        cafe.addProduct("Chicken Salad", 4.9);
        cafe.addProduct("Cheeseburger", 3.4);
        cafe.addProduct("Chicken Sandwich", 3.2);
        cafe.addProduct("Ice cream", 2.20);
        cafe.addProduct("Chocolate Cake", 2.50);
        cafe.addProduct("Biscuits", 2.0);
        cafe.addProduct("Mineral Water", 1.0);
        cafe.addProduct("Orange Juice", 1.25);
        cafe.addProduct("English Tea", 0.90);

        System.out.println("Menu: \n");
        System.out.println("Products & Prices\n");
        cafe.displayMenu();




    }
}