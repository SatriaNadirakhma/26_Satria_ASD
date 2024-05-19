package antrianvaksin;

import java.util.Scanner;
public class antrianVaksinMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        QueueVaksin26 antrianVaksinasi = new QueueVaksin26();

        while (true) {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println(" ");

            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("");
            System.out.print("Pilih Menu: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor antrian: ");
                    int nomorAntrian = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Masukkan nama penerima vaksin: ");
                    String nama = sc.nextLine();
                    antrianVaksinasi.enqueue(nomorAntrian, nama);
                    System.out.println("\u001B[32mData telah ditambahkan.\u001B[0m");
                    System.out.println();
                    break;
                
                case 2:
                    antrianVaksinasi.dequeue();
                    System.out.println();
                    break;
                
                case 3:
                    System.out.println("Daftar penerima vaksin:");
                    antrianVaksinasi.data();
                    System.out.println("Sisa Antrian: " + antrianVaksinasi.getSize());
                    System.out.println();
                    break;
                
                case 4:
                    System.out.println("\u001B[32mTerima kasih!\u001B[0m");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Menu tidak valid, silakan pilih menu yang sesuai.");
            }

        }
    }
}
