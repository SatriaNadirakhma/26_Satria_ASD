package jobsheet6;

import java.util.Scanner;
public class MainHotel26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        HotelService26 list = new HotelService26();
        Hotel26 h1 = new Hotel26("Niagara", "Malang", 200000, (byte) 3);
        Hotel26 h2 = new Hotel26("Oranje", "Surabaya", 350000, (byte) 5);
        Hotel26 h3 = new Hotel26("Whiz", "Malang", 400000, (byte) 4);
        Hotel26 h4 = new Hotel26("Ar Rahmah", "Malang", 600000, (byte) 5);
        Hotel26 h5 = new Hotel26("Tugu", "Gresik", 150000, (byte) 2);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data hotel sebelum sorting = ");
        list.tampil();

        System.out.println("Data hotel setelah bubble sorting desc berdasarkan bintang");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data hotel setelah bubble sorting asc berdasarkan harga");
        list.bubbleSort2();
        list.tampil();

        System.out.println("Data hotel setelah selection sorting desc berdasarkan bintang");
        list.selectionSort();
        list.tampil();

        System.out.println("Data hotel setelah selection sorting asc berdasarkan harga");
        list.selectionSort2();
        list.tampil();
    }
}