package Praktikum07;
import java.util.Scanner;

public class StackMain26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        StackPakaian26 stk = new StackPakaian26(5);

        char pilih;
        do {
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

            Pakaian26 p = new Pakaian26(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc26.next().charAt(0);
            sc26.nextLine();
            stk.push(p);
        } while (pilih == 'y');

        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
    }
}
