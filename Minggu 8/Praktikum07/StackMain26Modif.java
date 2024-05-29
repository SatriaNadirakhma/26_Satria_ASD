package Praktikum07;
import java.util.Scanner;

public class StackMain26Modif {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        StackPakaian26 stk = new StackPakaian26(5);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Pilih operasi: ");
            int operasi = sc26.nextInt();
            sc26.nextLine();

            switch (operasi) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc26.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc26.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc26.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc26.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc26.nextDouble();
                    sc26.nextLine();

                    Pakaian26 p = new Pakaian26(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
