import java.util.Scanner;
public class CanteenDemo26 {
    public static void main(String[] args) {
    Scanner sc26 = new Scanner (System.in);
        //Menggunakan objek-objek bertipe Item dengan constructor berparameter
        Item26 item1 = new Item26("Nasi Goreng", 15000, 10);
        Item26 item2 = new Item26("Donat Gula", 3000, 20);
        Item26 item3 = new Item26("Cimori", 7000, 15);

        //Deklarasi & Instansiasi Array
        Item26[] items = new Item26[3];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;

        //Looping
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item26();
            System.out.print("Name: ");
            items[i].name = sc26.nextLine();
            System.out.print("Price: ");
            items[i].price = sc26.nextDouble();
            System.out.print("Stock: ");
            items[i].stock = sc26.nextInt();

            sc26.nextLine();
        }
    }
}
