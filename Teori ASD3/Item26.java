public class Item26 {
    public String name;
    public double price;
    public int stock;

    public Item26() {

    }

    public Item26 (String itemName, double price, int stock) {
        name = itemName;
        price = price;
        stock = stock;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price : " + price);
        System.out.println("Stock: " + stock);
    }
}